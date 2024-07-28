package com.woody.calculator;

import java.util.List;
import java.util.stream.IntStream;

public class Arrangement {

	private List<String> userInputResult;
	
	protected boolean isInt = true;
	String gatheredNumbers = "";

	public Arrangement(List<String> userInputResult) {
		this.userInputResult = userInputResult;
	}

	public void arrangeNumbers(String userInput) {
		String[] splitedUserInput = userInput.split("");

		IntStream.range(0, splitedUserInput.length).forEach(i -> {
			if (!Character.isDigit(splitedUserInput[i].charAt(0))) {
				userInputResult.add(gatheredNumbers);
				userInputResult.add(splitedUserInput[i]);
				gatheredNumbers = "";
			} else {
				gatheredNumbers += splitedUserInput[i];
			}
		});
		if (!gatheredNumbers.isEmpty()) {
			userInputResult.add(gatheredNumbers);
		}
	}

	public void arrangeIndex(List<String> userInputResult, int index, Double result) {
		userInputResult.remove(index);
		userInputResult.set(index, Double.toString(result));
		userInputResult.remove(index - 1); // removed
	}

}
