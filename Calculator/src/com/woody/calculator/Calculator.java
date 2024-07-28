package com.woody.calculator;

import com.woody.calculator.able.Storable;

public class Calculator{
	
	private Arithmetic arithmetic;
	private Storable store;
	

	public Calculator(Arithmetic arithmetic, Storable store) {
		this.arithmetic = arithmetic;
		this.store = store;
	}
	
	public void calculate() {
		arithmetic.calculate(store);
	}
}
