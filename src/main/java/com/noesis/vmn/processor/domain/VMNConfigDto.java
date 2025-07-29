package com.noesis.vmn.processor.domain;

public class VMNConfigDto {
	
	private String vmnNumber;
	private String clientUrl;
	private String keyword;
	
	
	public String getVmnNumber() {
		return vmnNumber;
	}
	public void setVmnNumber(String vmnNumber) {
		this.vmnNumber = vmnNumber;
	}
	public String getClientUrl() {
		return clientUrl;
	}
	public void setClientUrl(String clientUrl) {
		this.clientUrl = clientUrl;
	}
	
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
	public VMNConfigDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public VMNConfigDto(String vmnNumber, String clientUrl, String keyword) {
		super();
		this.vmnNumber = vmnNumber;
		this.clientUrl = clientUrl;
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "VMNConfigDto [vmnNumber=" + vmnNumber + ", clientUrl=" + clientUrl + ", keyword=" + keyword + "]";
	}
	
	
	

}
