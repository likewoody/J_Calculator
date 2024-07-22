package com.calculator.base;

import java.util.ArrayList;
import java.util.List;

public class Arrange {
	
	private List<String> arrangeUserInput = new ArrayList<String>();
	
	public Arrange(List<String> arrangeUserInput) {
		// TODO Auto-generated constructor stub
		this.arrangeUserInput = arrangeUserInput;
	}
	
	public boolean numbers(String[] userInput) {
		String gatherNumbers = "";
		try {
			for(int i=0; i<userInput.length; i++) {
				
				if ("+".equals(userInput[i]) || "-".equals(userInput[i]) 
						|| "*".equals(userInput[i]) || "/".equals(userInput[i])) {
					
					if (!gatherNumbers.isEmpty()) {
						arrangeUserInput.add(gatherNumbers);
						gatherNumbers = "";
					}
					arrangeUserInput.add(userInput[i]);
				} else {
					Integer.parseInt(userInput[i]);
					gatherNumbers += userInput[i];
				}
			}
			if (!gatherNumbers.isEmpty()) {
				arrangeUserInput.add(gatherNumbers);
			}
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	
	
	public void index(int index, Double result) {
		arrangeUserInput.remove(index);
		arrangeUserInput.set(index, Double.toString(result));
	    arrangeUserInput.remove(index-1); // removed
	}

}
