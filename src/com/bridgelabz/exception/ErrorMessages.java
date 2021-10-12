package com.bridgelabz.exception;

public enum ErrorMessages {
	
	INVALID_DATA("Please enter a valid mood");

	private String message;

	ErrorMessages(String string) {
		this.message = message;
	}

	public String get() {
		return this.message;
	}
}
