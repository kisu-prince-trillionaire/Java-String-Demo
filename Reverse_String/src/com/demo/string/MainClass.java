package com.demo.string;

import com.demo.string.bean.StringOperation;

public class MainClass {

	public static void main(String[] args) {
		StringOperation strOps = new StringOperation("java");
		strOps.reverseUsingStringbuffer();
		
		StringOperation strOps1 = new StringOperation("python");
		strOps1.reverseString();
	}

}
