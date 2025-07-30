package com.noesis.vmn.processor.controller;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Cipher;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.noesis.domain.persistence.NgVMNConfig;
import com.noesis.domain.persistence.NgVMNTrans;
import com.noesis.domain.repository.NgVMNTransRepository;
import com.noesis.domain.service.NgVMNConfigService;
import com.noesis.domain.service.UserSenderIdMapService;
import com.noesis.vmn.processor.domain.VMNConfigDto;
import com.noesis.vmn.processor.domain.VMNTransDto;

@RestController
public class VMNServiceController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Value("${vmn.processor.instance.id}")
	private String instanceId;

	@Autowired
	ObjectMapper objectMapper;

	@Autowired
	UserSenderIdMapService userSenderIdMapService;

	@Autowired
	private NgVMNConfigService ngVMNConfigService;

	@Autowired
	private NgVMNTransRepository ngVMNTransRepository;

	@RequestMapping(value = "/vmnProvider", method = { RequestMethod.OPTIONS, RequestMethod.POST, RequestMethod.GET })
	public String vmnUpload(@RequestParam(value = "vmnNumber", required = false) String vmnNumber,
			@RequestParam(value = "mobileNumber", required = false) String mobileNumber,
			@RequestParam(value = "messageContent", required = false) String messageContent,
			@RequestParam(value = "circleName", required = false) String circleName,
			@RequestParam(value = "carrierName", required = false) String carrierName) throws IOException {

		logger.info("Request received from Operator: {}, destination: {}, message: {}", vmnNumber, mobileNumber,
				messageContent);

		String specificKeyword = extractSpecificKeyword(messageContent);
		logger.info("Value of specific keyword after extraction :" + specificKeyword);

		VMNTransDto vmnTransDto = new VMNTransDto();
		if (!vmnNumber.startsWith("91") || vmnNumber.startsWith("91") && vmnNumber.length() == 10) {
			vmnTransDto.setVmnNumber("91" + vmnNumber);
		} else {
			vmnTransDto.setVmnNumber(vmnNumber);
		}

		if (!mobileNumber.startsWith("91") || mobileNumber.startsWith("91") && mobileNumber.length() == 10) {
			vmnTransDto.setMobileNumber("91" + mobileNumber);
		} else {
			vmnTransDto.setMobileNumber(mobileNumber);
		}
		vmnTransDto.setMessageContent(messageContent);
		vmnTransDto.setCarrierName(carrierName);
		vmnTransDto.setCircleName(circleName);

		// Save requested Data in DB
		NgVMNTrans ngVMNTrans = new NgVMNTrans();
		if (!vmnNumber.startsWith("91") || vmnNumber.startsWith("91") && vmnNumber.length() == 10) {
			ngVMNTrans.setVmnNumber("91" + vmnNumber);
		} else {
			ngVMNTrans.setVmnNumber(vmnNumber);
		}
		if (!mobileNumber.startsWith("91") || mobileNumber.startsWith("91") && mobileNumber.length() == 10) {
			ngVMNTrans.setMobileNumber("91" + mobileNumber);
		} else {
			ngVMNTrans.setMobileNumber(mobileNumber);
		}
		ngVMNTrans.setMessageContent(messageContent);
		ngVMNTrans.setCarrierName(carrierName);
		ngVMNTrans.setCircleName(circleName);

		Date currentDate = new Date(); // Current date and time
		ngVMNTrans.setDate(currentDate);

//		List<NgVMNTrans> list = new ArrayList<>();
//		list.add(ngVMNTrans);
//
//		ngVMNTransRepository.save(list);

		// Fetching Data from VMNConfig Table
		List<NgVMNConfig> vmnDetails = ngVMNConfigService.getVmnDetails(vmnNumber,
				specificKeyword != null && !specificKeyword.isEmpty() ? specificKeyword : null);

		logger.info("Fetching details from NgVMNConfig :" + vmnDetails);
		logger.info("the message id is 124............");

		if (!vmnDetails.isEmpty()) {

			NgVMNConfig ngVMNConfig = vmnDetails.get(0);
			String clientUrl = ngVMNConfig.getClientUrl();
			VMNConfigDto configDto = new VMNConfigDto();
			configDto.setClientUrl(clientUrl);

			if (clientUrl != null) {
				clientUrl = clientUrl.replace("##vmnNumber##", vmnTransDto.getVmnNumber());
				clientUrl = clientUrl.replace("##mobileNumber##", vmnTransDto.getMobileNumber());

				try {
//					String encodedString = vmnTransDto.getMessageContent();
//					encodedString = encodedString.replace("+", "%20");
					clientUrl = clientUrl.replaceAll("##messageContent##",
							URLEncoder.encode(vmnTransDto.getMessageContent(), "UTF-8"));
					logger.info("The encoded message will be :"
							+ URLEncoder.encode(vmnTransDto.getMessageContent(), "UTF-8"));
				} catch (Exception e) {
					logger.error("Error while converting unicode message to HEX string: " + e.getMessage());
					e.printStackTrace();
				}

				if (clientUrl.contains("##carrierName##")) {
					clientUrl = clientUrl.replace("##carrierName##", vmnTransDto.getCarrierName());
				}
				if (clientUrl.contains("##circleName##")) {
					clientUrl = clientUrl.replace("##circleName##", vmnTransDto.getCircleName());
				}

				if (clientUrl.contains("##timeStamp##")) {
					long time = ngVMNTrans.getDate().getTime();
					long timeInSec = (time / 1000) * 1000;
					clientUrl = clientUrl.replaceAll("##timeStamp##", Long.toString(timeInSec));
				}
//				Date date = new Date(ngVMNTrans.getDate().getSeconds());
//				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//				if (clientUrl.contains("##timeStamp##")) {
//					clientUrl = clientUrl.replaceAll("##timeStamp##", URLEncoder.encode(formatter.format(date), "UTF-8"));
//				}
//				if (messageObject.getReceiveTime() != null) {
//					long timeInMillis = messageObject.getReceiveTime().getTime();
//					long timeInSec = (timeInMillis / 1000) * 1000;
//					dlrUrl = dlrUrl.replaceAll("%RCVTIME%", Long.toString(timeInSec));
//				}

			}

			logger.info("Final Client URL will be :" + clientUrl);

			char dlrjson = ngVMNConfig.getDlrjson();

			HttpURLConnection connection;

			if (dlrjson == 'Y') {

				String cleanUrl = ngVMNConfig.getClientUrl().split("\\?")[0];
				URL url = new URL(cleanUrl);
				connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("POST");
				connection.setRequestProperty("Content-Type", "application/json");
				connection.setRequestProperty("Accept", "*/*");
				connection.setRequestProperty("User-Agent", "Mozilla/5.0");
				connection.setDoOutput(true);

				Map<String, String> jsonMap = new HashMap<>();
				String Url = ngVMNConfig.getClientUrl();

				if (Url.contains("##vmnNumber##")) {
					jsonMap.put("vmnNumber", vmnTransDto.getVmnNumber());
				}

				if (Url.contains("##mobileNumber##")) {
					jsonMap.put("mobileNumber", vmnTransDto.getMobileNumber());
				}

				if (Url.contains("##messageContent##")) {
					jsonMap.put("messageContent", vmnTransDto.getMessageContent());
				}

				if (Url.contains("##circleName##")) {
					jsonMap.put("circleName", vmnTransDto.getCircleName());
				}

				if (Url.contains("##carrierName##")) {
					jsonMap.put("carrierName", vmnTransDto.getCarrierName());
				}

				if (Url.contains("##keyword##")) {
					jsonMap.put("keyword", vmnTransDto.getKeyword());
				}
				if (Url.contains("##timeStamp##")) {
					long time = ngVMNTrans.getDate().getTime();
					long timeInSec = (time / 1000) * 1000;
					jsonMap.put("timeStamp", String.valueOf(timeInSec));
				}

				String payload = null;
				// Encryption requirement (Start)
				char isEncrypted = ngVMNConfig.getIsEncrypted();
				if (isEncrypted == 'Y') {
					try {
						Security.addProvider(new BouncyCastleProvider());

						InputStream inputStream = getClass().getClassLoader().getResourceAsStream("public4096_key.der");

						if (inputStream == null) {
							throw new FileNotFoundException("public_key.der not found in classpath.");
						}

						ByteArrayOutputStream buffer = new ByteArrayOutputStream();
						int nRead;
						byte[] data = new byte[16384];
						while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
							buffer.write(data, 0, nRead);
						}
						buffer.flush();
						byte[] readAllBytes = buffer.toByteArray();
						X509EncodedKeySpec keySpec = new X509EncodedKeySpec(readAllBytes);
						PublicKey publicKey = KeyFactory.getInstance("RSA").generatePublic(keySpec);

						Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-512AndMGF1Padding", "BC");
						cipher.init(Cipher.ENCRYPT_MODE, publicKey);

						String jsonPayload = objectMapper.writeValueAsString(jsonMap);
						logger.info("JSON Payload before encryption: {}", jsonPayload);
						byte[] encryptedBytes = cipher.doFinal(jsonPayload.getBytes("UTF-8"));
						String encryptedBase64 = Base64.getEncoder().encodeToString(encryptedBytes);

						payload = objectMapper.writeValueAsString(Collections.singletonMap("encData", encryptedBase64));
						logger.info("Encrypted JSON payload: {}", payload);

						connection.setRequestProperty("Authorization", "Basic SnVzYml6OkFyZHJhQEAyMDIz");

					} catch (Exception e) {
						logger.error("Encryption failed, fallback to plain payload", e);
						payload = objectMapper.writeValueAsString(jsonMap);
					}

				} else {
					payload = objectMapper.writeValueAsString(jsonMap);
					logger.info("Sending JSON payload: {}", payload);
				}
				// END

				try (OutputStream os = connection.getOutputStream()) {
					os.write(payload.getBytes("UTF-8"));
					os.flush();
				}
			} else {
				URL url = new URL(clientUrl);
				connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.setRequestProperty("Accept", "*/*");
				connection.setRequestProperty("User-Agent", "Mozilla/5.0");
				connection.setRequestProperty("Content-Type", "application/json");
				connection.setDoOutput(true);
			}

			int i = connection.getResponseCode();
			logger.info("VMN Push Url is :" + clientUrl + " and Response from user push url is : " + i);
			ngVMNTrans.setKeyword(specificKeyword);
			ngVMNTrans.setRespCode(i);
			List<NgVMNTrans> list = new ArrayList<>();
			list.add(ngVMNTrans);

			ngVMNTransRepository.save(list);
		}

		return null;
	}

	public static void main(String[] args) throws IOException {
		VMNServiceController con = new VMNServiceController();
		String vmnNumber = "7817086532";
		String mobileNumber = "8468958475";
		String messageContent = "hi";
		String carrierName = "Del";
		String circleName = "AIRTEL";
//		Date date = new Date(2023, 11, 23);
		try {
			con.vmnUpload(vmnNumber, mobileNumber, messageContent, carrierName, circleName);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}

//		try {
//			Security.addProvider(new BouncyCastleProvider());
//
//			InputStream inputStream = VMNServiceController.class.getClassLoader()
//					.getResourceAsStream("private4096_key.der");
//			if (inputStream == null) {
//				throw new FileNotFoundException("private1_key.der not found in classpath.");
//			}
//
//			// Convert stream to byte array (Java 8 compatible)
//			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
//			int nRead;
//			byte[] data = new byte[16384];
//			while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
//				buffer.write(data, 0, nRead);
//			}
//			buffer.flush();
//			byte[] privateKeyBytes = buffer.toByteArray();
//
//			PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
//			PrivateKey privateKey = KeyFactory.getInstance("RSA").generatePrivate(keySpec);
//
//			Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-512AndMGF1Padding", "BC");
//			cipher.init(Cipher.DECRYPT_MODE, privateKey);
//
//			// Your Base64 string here
//			String encryptedBase64 = "<paste-encrypted-string>";
//			byte[] encryptedBytes = Base64.getDecoder().decode(encryptedBase64);
//
//			byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
//			String decryptedJson = new String(decryptedBytes, "UTF-8");
//
//			System.out.println("Decrypted JSON Payload:\n" + decryptedJson);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

	private String extractSpecificKeyword(String messageContent) {
		// Define your specific keyword pattern
		// Here we assume it consists of letters and is followed by a space
		Pattern pattern = Pattern.compile("^\\S+");
		;
		Matcher matcher = pattern.matcher(messageContent);

		// Check if pattern is found

		if (matcher.find()) {
			String keyword = matcher.group().trim(); // Extract the matched group
			logger.info("Specific keyword: " + keyword); // Output: Specific keyword
			return keyword;
		}
		return null;
	}

}
