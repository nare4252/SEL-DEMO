package com.word;

public class WordManually {

	public static void main(String[] args) {
		String string = "Hello";
		String result = null;
		for (int i = string.length(); i >= 0; i--) {
			 
			 result =  result + string.charAt(i);
			
		}System.out.println(result);

	}

}
