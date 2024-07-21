package com.calculator.base;

import java.util.Scanner;

/*
 	Author : Woody Jo
 	Description : Calculator by java
 	Date : July 18, 2024 Thursday
 */


/*
 * 구현
 * 1. input process class
 * 2. 유저의 input을 받아서 처리하는 class
 * 3. 어떤 연산인지 처리하는 interface
 */



public class UserIO {
	
	// property
	String userInput;
	
	// method
	public String userInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================");
		
		userInput = sc.nextLine();
		
		return userInput;
	}
	
	public void userOutput() {
		Calculator calculator = new Calculator(userInput);
		calculator.execute();
	}
} // class
