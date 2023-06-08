package com.stackroute.userapp.exception;

public class UserNotFoundException extends Exception {
	
	String msg;

	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String msg) {
		super(msg);
		
	}
	

}
