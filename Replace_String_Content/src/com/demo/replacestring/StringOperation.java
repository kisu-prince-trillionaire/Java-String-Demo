package com.demo.replacestring;

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
	
	public void replaceContent() {
		strVar = strVar.replaceAll("\\s", "");
		System.out.println(strVar);
	}
}
