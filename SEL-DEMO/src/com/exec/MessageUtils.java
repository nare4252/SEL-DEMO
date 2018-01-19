package com.exec;

public class MessageUtils {
	private String message;
	private String messageOne;

	public MessageUtils(String message) {
		super();
		this.message = message;
		this.messageOne = messageOne;
	}
	
	public String printMessage(){
		System.out.println(message);
		return message;
		
	}
	
	public String printMessageOne(){
		System.out.println(messageOne);
		return messageOne;
	}
}
