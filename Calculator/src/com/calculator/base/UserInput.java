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



public class UserInput {
	private static final String startMsg = "계산기 실행\n예시 : 3 * 8\n종료 : 0\n";
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		boolean isFlag = true;
		
		System.out.print(startMsg);
		
		while (isFlag) {
			System.out.println("======================");
			String userInput = sc.nextLine();
			
			// 유저로부터 입력을 받으면 입력받아서 각각의 3, *, 8 로 넘기는 것이 좋을까?
			// 아니면 String으로 넘겨서 처리하는 것이 좋을까?	
			if (userInput.equals("0")) {
				break;
			}
			Calculator calculator = new Calculator(userInput);
			
		} // while
		
	} // main
} // class
