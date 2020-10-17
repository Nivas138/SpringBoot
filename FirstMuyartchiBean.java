package com.learningstudent.restwebservice.learingrestframework;

public class FirstMuyartchiBean {
	
	private String message;

	public FirstMuyartchiBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "FirstMuyartchiBean [message=" + message + "]";
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
