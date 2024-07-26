package com.woody.calculator;

public class Display {
	
	public static void main(String[] args) {
		
		Input inputCalculator = new Input();
		Output outputCalculator = new Output(inputCalculator);
		
		outputCalculator.outputMessage();	
	}
}
