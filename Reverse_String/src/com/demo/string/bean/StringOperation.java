package com.demo.string.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringOperation {
	private String strVar;

	public StringOperation() {
		super();
	}

	public StringOperation(String strVar) {
		super();
		this.strVar = strVar;
	}

	public String getStrVar() {
		return strVar;
	}

	public void setStrVar(String strVar) {
		this.strVar = strVar;
	}

	public void reverseUsingStringbuffer() {
		StringBuffer sbf = new StringBuffer(strVar);
		System.out.println("The String is : " + sbf);
		sbf.reverse();
		System.out.println("Reversed String using String Buffer is : " + sbf);
	}

	public void reverseString() {
		char[] str = strVar.toCharArray();
		List<Character> revStr = new ArrayList<Character>();
		for (char c : str)
			revStr.add(c);

		Collections.reverse(revStr);
		ListIterator<Character> itr = revStr.listIterator();
		System.out.println("The string is : " + strVar);
		System.out.print("The reversed string is : ");
		while (itr.hasNext())
			System.out.print(itr.next());
	}
}
