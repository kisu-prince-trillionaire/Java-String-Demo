package com.demo.splitstring;

import com.demo.splitstring.bean.StringOperation;

public class MainClass {

	public static void main(String[] args) {
		StringOperation strOp = new StringOperation("My name is, Vishal. I live in, Patna.");
		strOp.splitString();
	}

}
