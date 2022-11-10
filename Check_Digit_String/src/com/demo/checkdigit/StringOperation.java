package com.demo.checkdigit;

public class StringOperation {
	private String strVar;

	public StringOperation(String strVar) {
		super();
		this.strVar = strVar;
	}

	public StringOperation() {
		super();
	}

	public String getStrVar() {
		return strVar;
	}

	public void setStrVar(String strVar) {
		this.strVar = strVar;
	}

	public void checkDigit() {
		char[] chars = strVar.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : chars) {
			if (Character.isDigit(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}
