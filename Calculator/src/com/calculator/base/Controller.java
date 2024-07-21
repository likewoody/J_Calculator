package com.calculator.base;

public class Controller {
	private static final String startMsg = "계산기 실행\n예시 : 3*8+3\n종료 : 0\n";
	private static final String exitMsg = "계산기가 종료 되었습니다.";
	private static final String exitNumber = "0";
	
	public static void main(String[] args) {
		
		boolean isFlag = true;
		UserIO userIO = new UserIO();
		
		System.out.print(startMsg);
		
		while (isFlag) {
			String userInput = userIO.userInput();
			
			if (userInput.equals(exitNumber)) {
				System.out.println(exitMsg);
				break;
			}
			
			userIO.userOutput();
		} // while
	}
}
