package com.woody.calculator;

public class Main {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator(new Arithmetic(), new MemoryStore());
		
		calculator.calculate();
	}
}
