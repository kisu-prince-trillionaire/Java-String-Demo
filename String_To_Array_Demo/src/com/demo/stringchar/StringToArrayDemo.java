package com.demo.stringchar;

public class StringToArrayDemo {

	public static void main(String[] args) {
		String literal = "Sachin Tendulkar";
		System.out.println("The string is : " + literal);
		
		char[] ch = literal.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

}
