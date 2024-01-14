package com.globaException.globaException.exception;

public enum Error {
	PMDM_ServiceName_Address_Property("code","message"),
	PMDM_ServiceName_Address_1000("1000","Connection Failure"),
	PMDM_ServiceName_Address_1001("1001","Resource not Found");
	
	private Error(String code, String message) {
		this.code = code;
		this.message = message;
	}
	private final String code;
	private final String message;
	
	public String getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	
}
