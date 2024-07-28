package com.woody.calculator;

import java.util.Scanner;

public class Input {
	
	private static final String SEPERATOR = "======================"; 

	public String inputArithmetic() {
		Scanner input = new Scanner(System.in);
		
		System.out.println(SEPERATOR);
		
		String userInput = input.nextLine();
		return userInput;
	}
}
