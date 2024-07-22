package com.calculator.base;

import java.util.Scanner;

/*
 	Author : Woody Jo
 	Description : Calculator by java
 	Date : July 18, 2024 Thursday
 */

public class UserIO {
	
	private String userInput;
	private double result;
	
	
	public String userInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================");
		
		userInput = sc.nextLine();
		
		return userInput;
	}
	
	public void userOutput() {
		Calculator calculator = new Calculator(userInput);
		result = calculator.calculator();
		
		
		String[] strResult = String.format("%.2f", result).split("\\.");
		
		for (int i=0; i<strResult.length; i++) {
			if (i==1) {
				if (Integer.parseInt(strResult[i]) > 0) {
					System.out.println("계산 결과는 : " + String.format("%.2f", result));
				}
				if (Integer.parseInt(strResult[i]) <= 0) {
					System.out.println("계산 결과는 : " + Math.round(result));
				}
			}
		}
	}
} // class
