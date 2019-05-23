package com.example.exception;

public class MyFileNotFountException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2204739429905444657L;
	private String errorMessage;
	private String errorCode;
	private Object rootCause;

	public MyFileNotFountException(String errorMessage, String errorCode, Object rootCause) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.rootCause = rootCause;
	}

	public MyFileNotFountException(String errorMessage, String errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}

	public MyFileNotFountException(String errorMessage, String errorCode, Throwable rootCause) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.rootCause = rootCause;
	}

	public MyFileNotFountException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Object getrootCause() {
		return rootCause;
	}

	public void setrootCause(Throwable rootCause) {
		this.rootCause = rootCause;
	}

}
