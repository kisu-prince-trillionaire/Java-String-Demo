package com.demo.chararray;

public class CharArrayCopyDemo {

	public static void main(String[] args) {
		char[] data = { 'n', 'a', 'r', 'e', 's', 'h', 'i', 't', 'e', 'c', 'h' };
		
		String str = String.valueOf(data);
		System.out.println("The String of valueOf is : " + str);
		
		String str1 = String.copyValueOf(data);
		System.out.println("The String of copyValueOf is : " + str1);
	}

}
