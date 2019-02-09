package com.em.spring;

public class HelloSpring {

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void saySomething() {
		System.out.println(message);
	}
	
}
