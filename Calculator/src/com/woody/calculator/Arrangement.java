package com.woody.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Arrangement {

	private List<String> userInputResult = new ArrayList<String>();
	protected boolean isInt;
	String gatheredNumbers = "";

	public Arrangement() {}

	public List<String> arrangeInputLine(String userInput) {
		String[] splitedUserInput = userInput.split("");

		try {
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
			isInt = true;
		} catch (Exception e) {
			// TODO: handle exception
			isInt = false;
		}
		return userInputResult;
	}

	public void arrangeIndex(List<String> userInputResult, int index, Double result) {
		userInputResult.remove(index);
		userInputResult.set(index, Double.toString(result));
		userInputResult.remove(index - 1); // removed
	}

}
