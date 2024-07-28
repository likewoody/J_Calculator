package com.woody.calculator;

import com.woody.calculator.able.Calculable;
import com.woody.calculator.able.Storable;

public class Calculator implements Calculable{
	
	private Storable store;
	
	public Calculator(Storable store) {
		this.store = store;
	}
	
	@Override
	public void calculate() {
		Arithmetic arithmetic = new Arithmetic(store);
		arithmetic.calculateMulDiv();
	}
}
