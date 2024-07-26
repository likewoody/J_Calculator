package com.woody.calculator;

import java.util.Scanner;

public class Input {
	
	private static final String SEPERATOR = "======================"; 
	private String userInput;

	public String inputArithmetic() {
		Scanner input = new Scanner(System.in);
		
		System.out.println(SEPERATOR);
		
		userInput = input.nextLine();
		return userInput;
	}
}
