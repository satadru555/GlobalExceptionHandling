package com.globaException.globaException.exception;

public class ConnectionFailureException extends RuntimeException{
	/**
	 * 
	 */
	public ConnectionFailureException(String code) {
        super(code);
    }
	private String message;
	private long timestamp;
	private String code;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
	
	
	
	

	
}
