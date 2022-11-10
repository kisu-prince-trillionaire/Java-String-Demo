package com.demo.splitstring.bean;

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
	
	public void splitString() {
		String[] strArr = strVar.split("[,.]");
		for(int i = 0; i< strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
}
