package com.noesis.vmn.processor.domain;

import java.util.Date;

public class VMNTransDto {
	
	private String vmnNumber;
	private String mobileNumber;
	private String messageContent;
	private Date date;
	private String circleName;
	private String carrierName;
	private String keyword;
	
	
	public String getVmnNumber() {
		return vmnNumber;
	}
	public void setVmnNumber(String vmnNumber) {
		this.vmnNumber = vmnNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getMessageContent() {
		return messageContent;
	}
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCircleName() {
		return circleName;
	}
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
	public VMNTransDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public VMNTransDto(String vmnNumber, String mobileNumber, String messageContent, Date date, String circleName,
			String carrierName, String keyword) {
		super();
		this.vmnNumber = vmnNumber;
		this.mobileNumber = mobileNumber;
		this.messageContent = messageContent;
		this.date = date;
		this.circleName = circleName;
		this.carrierName = carrierName;
		this.keyword = keyword;
	}
	
	
	@Override
	public String toString() {
		return "VMNTransDto [vmnNumber=" + vmnNumber + ", mobileNumber=" + mobileNumber + ", messageContent="
				+ messageContent + ", date=" + date + ", circleName=" + circleName + ", carrierName=" + carrierName
				+ ", keyword=" + keyword + "]";
	}

	

}
