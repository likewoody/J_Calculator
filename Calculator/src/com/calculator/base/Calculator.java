package com.calculator.base;

import java.util.ArrayList;
import java.util.List;

public class Calculator implements Arithmetic{
	
	private static final String errorMsg = "정확한 값을 입력하세요.";
//	private static final String[] arithmetic = {"+", "-", "*", "/"};
	private String[] userInput;
	private List<String> arrangeUserInput = new ArrayList<String>();
	private boolean isInt = false;
	 
	
	
	public Calculator(String userInput) {
		// TODO Auto-generated constructor stub
		this.userInput = userInput.split("");
	} // Constructor

	public void execute() {
		arrangeNumbers();
		// *********8여기 까지 완료 ************
		// Int parse이 되면은 정확한 데이터가 들어온 것이고/
		// 여기서 이제 사칙연산 * / 먼저  그리고 + - 차례대로 실행시키면 된다.
		if (isInt) {
			for (String userInput : arrangeUserInput) {
				System.out.println(userInput);
			}
		} else {
			// TODO: handle exception
			System.out.println(errorMsg);
		}
	}
	
	private void arrangeNumbers() {
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
			isInt = true;
		} catch (Exception e) {
			// TODO: handle exception
			isInt = false;
		}
		
	}
	
	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
//		return n1 + n2;
	}

	@Override
	public int sub(int num1, int num2) {
		
		// TODO Auto-generated method stub
//		return n1 - n2;
		return num1 - num2;
	}
	
	@Override
	public int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
//		return n1 + n2;
	}

	@Override
	public double div(int num1, int num2) {
		
		// TODO Auto-generated method stub
//		return n1 - n2;
		return num1/num2;
	}
	
}
