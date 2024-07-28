package com.woody.calculator;

import java.util.ArrayList;
import java.util.List;

import com.woody.calculator.able.Arithmetical;
import com.woody.calculator.able.Calculable;
import com.woody.calculator.able.CalculableAddSub;
import com.woody.calculator.able.CalculableMulDiv;
import com.woody.calculator.able.Storable;

public class Arithmetic implements CalculableMulDiv, CalculableAddSub, Arithmetical {

	private static final String EXIT_NUMBER = "0";
	private static final String SHOW_HISTORY_NUMBER = "1";
	
	private Input input = new Input();
	private Output output = new Output();

	private List<String> userInputResult;
	private Arrangement arrangement;
	private Storable store;
	
	private double result = 0;
	
	public Arithmetic(Storable store) {
		// TODO Auto-generated constructor stub
		this.store = store;
	}
	

//	@Override
//	public void calculate() {
//		// TODO Auto-generated method stub
//		this.store = store;
//		calculateMulDiv();
//	}

	@Override
	public void calculateMulDiv(){
		// TODO Auto-generated method stub
		boolean isFlag = true;
		String regex = "^[0-9+\\-*/]+$";

		System.out.print(output.START_MESSAGE);

		while (isFlag) {
			// userInputResult 초기화
			userInputResult = new ArrayList<String>();
			arrangement = new Arrangement(userInputResult);

			String userInput = input.inputArithmetic();

			if (userInput.equals(EXIT_NUMBER)) {
				output.printExitMessage();
				break;
			}
			
			if (userInput.equals(SHOW_HISTORY_NUMBER)) {
				store.show();
				continue;
			}

			if (!userInput.matches(regex)) {
				output.printErrorMessage();
				continue;
			}

			arrangement.arrangeNumbers(userInput);

			for (int i = 0; i < userInputResult.size(); i++) {
				if ("*".equals(userInputResult.get(i))) {
					result = mul(Double.parseDouble(userInputResult.get(i - 1)),
							Double.parseDouble(userInputResult.get(i + 1)));
					arrangement.arrangeIndex(userInputResult, i, result);
					i--;
					continue;
				}

				if ("/".equals(userInputResult.get(i))) {
					result = div(Double.parseDouble(userInputResult.get(i - 1)),
							Double.parseDouble(userInputResult.get(i + 1)));
					arrangement.arrangeIndex(userInputResult, i, result);
					i--;
					continue;
				}
			}
			System.out.println("check result 1 : " + result);
			System.out.println("check userInputResult 1 : " + userInputResult);
			calculateAddSub();
		}
	}

	@Override
	public void calculateAddSub() {
		// TODO Auto-generated method stub
		for (int i = 0; i < userInputResult.size(); i++) {
			if ("+".equals(userInputResult.get(i))) {
				result = add(Double.parseDouble(userInputResult.get(i - 1)),
						Double.parseDouble(userInputResult.get(i + 1)));
				arrangement.arrangeIndex(userInputResult, i, result);
				i--;
				continue;
			}

			if ("-".equals(userInputResult.get(i))) {
				result = sub(Double.parseDouble(userInputResult.get(i - 1)),
						Double.parseDouble(userInputResult.get(i + 1)));
				arrangement.arrangeIndex(userInputResult, i, result);
				i--;
				continue;
			}
		}
		
		store.save(Double.toString(result));
		output.printResult(result);

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
		return num1 / num2;
	}

}
