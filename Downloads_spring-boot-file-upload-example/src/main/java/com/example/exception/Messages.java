package com.example.exception;

public class Messages {
	private Integer errorCode;
	private String message;
	private Throwable cause;
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Throwable getCause() {
		return cause;
	}
	public void setCause(Throwable cause) {
		this.cause = cause;
	}
	public Messages(Integer errorCode, String message, Throwable cause) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.cause = cause;
	}
	public Messages(Integer errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}
	public Messages(String message) {
		super();
		this.message = message;
	}

}
