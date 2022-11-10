package com.demo.string;

public class LeadingZeroDemo {

	public static void main(String[] args) {
		int number = 1500;
		System.out.println("The string number is : " + number);
		
		String formattedStr = String.format("%010d", number);
		System.out.println(formattedStr);
	}

}
