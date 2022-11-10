package com.demo.javastring;

import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseByWord {

	public static void main(String[] args) {
		String text = "My name is Vishal";
		StringTokenizer stVar = new StringTokenizer(text);
		
		String outputText = "";
		
		Stack<String> stack = new Stack<String>();
		
		while(stVar.hasMoreElements()) {
			outputText = (String) stVar.nextElement();
			stack.push(outputText);
		}
		
		outputText = "";
		while(!stack.empty()) {
			outputText = outputText + stack.pop() + " ";
		}
		
		System.out.println("Original text by word : " + text);
		System.out.println("Reversed text by word : " + outputText);
	}

}
