package com.woody.calculator;

public class Output {

	public static final String START_MESSAGE = "계산기 실행\n예시 : 3*8+3\n종료 : 0\n계산 목록 : 1\n";
	private static final String EXIT_MESSAGE = "계산기가 종료 되었습니다.";
	private static final String ERROR_MEESAGE = "정확한 값을 입력하세요.";

	public Output() {}

	public void printExitMessage() {
		System.out.println(EXIT_MESSAGE);
	}

	public void printResult(double result) {
		System.out.println("계산기 결과 : " + String.format("%.2f", result));
	}

	public void printErrorMessage() {
		System.out.println(ERROR_MEESAGE);
	}
}
