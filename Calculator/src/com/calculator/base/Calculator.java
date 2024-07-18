package com.calculator.base;

//import com.calculator.cond.CheckCondition;

public class Calculator implements Arithmetic{
	private static final String errorMsg = "정확한 값을 입력하세요.";
	
	private static final String[] ari = {"+", "-", "*", "/"};
	
	// Property 
	private int n1, n2;
	
	// Constructor
	public Calculator(String userInput) {
		// TODO Auto-generated constructor stub
		String[] strArr = new String[3]; // userInput을 담을 array
		
		
		strArr = userInput.split(" ");
		
		try {
			boolean isAri = false;
			// split으로 나눈 것을 분리한다.
			this.n1 = Integer.parseInt(strArr[0]);
			this.n2 = Integer.parseInt(strArr[2]);
			 	
			// 음 확장성을 고려하면 이 방법이 좋은 방법은 아닌거 같은데 
			for (int i=0;i<ari.length;i++) {
				if (ari[i].contains(strArr[1])) {
					isAri = true;
					break;
				}
			}
			// 사칙연산 +, -, *, /가 들어가 있지 않다면 errorMsg 출
			if (isAri) {
				if (ari[0].contains(strArr[1])) {
					System.out.println("result : " + add());
				}
				if (ari[1].contains(strArr[1])) {
					System.out.println("result : " + sub());	
				}
			}else {
				System.out.println(errorMsg);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(errorMsg);
		} // try ~ catch
	} // Constructor
	
	// Method
	@Override
	public int add() {
		// TODO Auto-generated method stub
		
		return n1 + n2;
	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return n1 - n2;
	}
	
}
