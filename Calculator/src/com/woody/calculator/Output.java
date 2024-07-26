package com.woody.calculator;

import java.util.List;

public class Output {

	private static final String START_MESSAGE = "계산기 실행\n예시 : 3*8+3\n종료 : 0\n";
	private static final String EXIT_MESSAGE = "계산기가 종료 되었습니다.";
	private static final String EXIT_NUMBER = "0";
	private static final String ERROR_MEESAGE = "정확한 값을 입력하세요.";

	private List<String> userInputResult;
	private Input inputArithmetic;
	private double result;

	public Output(Input inputArithmetic) {
		// TODO Auto-generated constructor stub
		this.inputArithmetic = inputArithmetic;
	}

	public void outputMessage() {
		boolean isFlag = true;

		System.out.print(START_MESSAGE);

		while (isFlag) {
			String userInput = inputArithmetic.inputArithmetic();

			if (userInput.equals(EXIT_NUMBER)) {
				System.out.println(EXIT_MESSAGE);
				break;
			}
			outputResult(userInput);
		} // while
	}

	private void outputResult(String userInput) {
		Calculator calculator = new Calculator();
		Arrangement arrangement = new Arrangement();

		userInputResult = arrangement.arrangeInputLine(userInput);

		if (arrangement.isInt) {
			calculator.calculateMulAndDiv(userInputResult);
			result = calculator.calculateAddAndSub(userInputResult);
		} else {
			System.out.println(ERROR_MEESAGE);
		}

		System.out.println("계산기 결과 : " + String.format("%.2f", result));
	}
}
