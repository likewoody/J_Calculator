package com.woody.calculator;

import java.util.List;
import java.util.stream.IntStream;

public class Calculator {
	
	private Arrangement arrangement = new Arrangement();
	private Arithmetic arithmetic = new Arithmetic();
	private double result = 0;

	public Calculator() {}

	public void calculateMulAndDiv(List<String> userInputResult) {
		for (int i = 0; i < userInputResult.size(); i++) {
			if ("*".equals(userInputResult.get(i))) {
				result = arithmetic.mul(Double.parseDouble(userInputResult.get(i - 1)),
						Double.parseDouble(userInputResult.get(i + 1)));
				arrangement.arrangeIndex(userInputResult, i, result);
				i--;
				continue;
			}

			if ("/".equals(userInputResult.get(i))) {
				result = arithmetic.div(Double.parseDouble(userInputResult.get(i - 1)),
						Double.parseDouble(userInputResult.get(i + 1)));
				arrangement.arrangeIndex(userInputResult, i, result);
				i--;
				continue;
			}
		}
	}

	public double calculateAddAndSub(List<String> userInputResult) {
		for (int i = 0; i < userInputResult.size(); i++) {
			if ("+".equals(userInputResult.get(i))) {
				result = arithmetic.add(Double.parseDouble(userInputResult.get(i - 1)),
						Double.parseDouble(userInputResult.get(i + 1)));
				arrangement.arrangeIndex(userInputResult, i, result);
				i--;
				continue;
			}

			if ("-".equals(userInputResult.get(i))) {
				result = arithmetic.sub(Double.parseDouble(userInputResult.get(i - 1)),
						Double.parseDouble(userInputResult.get(i + 1)));
				arrangement.arrangeIndex(userInputResult, i, result);
				i--;
				continue;
			}
		}
		return result;
	}
}
