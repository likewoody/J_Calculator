package com.calculator.base;

import java.util.ArrayList;
import java.util.List;

public class Calculator implements Arithmetic{
	
	private static final String errorMsg = "정확한 값을 입력하세요.";
	private String[] userInput;
	private List<String> arrangeUserInput = new ArrayList<String>();
	private boolean isInt = false;
	private Arrange arrange = new Arrange(arrangeUserInput);
	
	
	public Calculator(String userInput) {
		// TODO Auto-generated constructor stub
		this.userInput = userInput.split("");
	} // Constructor
	

	public double calculator() {
		isInt = arrange.numbers(userInput);
		
		double result = 0;
		if (isInt) {
			result = mustFirstCalculateMulAndDiv(result);
			result = secondCalculateAddAndSub(result);
			
		} else {
			// TODO: handle exception
			System.out.println(errorMsg);
		}
		
		return result;
	}
	
	private double mustFirstCalculateMulAndDiv(double result) {
		for (int i=0; i<arrangeUserInput.size(); i++) {
			
			String str = arrangeUserInput.get(i);
			
			if ("*".equals(str)) {
				
				result = mul(Double.parseDouble(arrangeUserInput.get(i-1)), 
						Double.parseDouble(arrangeUserInput.get(i+1)));
				
				arrange.index(i, result);
				i--;
			}
			
			if ("/".equals(str)) {
				
				result = div(Double.parseDouble(arrangeUserInput.get(i-1)), 
						Double.parseDouble(arrangeUserInput.get(i+1)));
				
				arrange.index(i, result);
				i--;
			}
		}
		
		return result;
	}
	
	private double secondCalculateAddAndSub(double result) {
		for (int i=0; i<arrangeUserInput.size(); i++) {
			String str = arrangeUserInput.get(i);
			
			if ("+".equals(str)) {
				result = add(Double.parseDouble(arrangeUserInput.get(i-1)), 
						Double.parseDouble(arrangeUserInput.get(i+1)));
				arrange.index(i, result);
				i--;
			}
			
			if ("-".equals(str)) {
				result = sub(Double.parseDouble(arrangeUserInput.get(i-1)), 
						Double.parseDouble(arrangeUserInput.get(i+1)));
				arrange.index(i, result);
				i--;
			}
		}
		return result;
	}
	
	@Override
	public double add(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public double sub(double num1, double num2) {
		
		// TODO Auto-generated method stub
		return num1 - num2;
	}
	
	@Override
	public double mul(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public double div(double num1, double num2) {
		
		// TODO Auto-generated method stub
		return num1/num2;
	}
	
}
