package com.example.exception;
public class FileStorageException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3857328214174219347L;

	public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
    
}