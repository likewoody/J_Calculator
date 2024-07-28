package com.woody.calculator;

import java.util.ArrayList;
import java.util.List;

import com.woody.calculator.able.Storable;

public class MemoryStore implements Storable {
	
	private static final String showMessage = "결과 목록 : ";
	
	private List<String> store = new ArrayList<String>();
	
	@Override
	public void save(String result) {
		// TODO Auto-generated method stub
		store.add(result);
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(showMessage + store);
	}

}
