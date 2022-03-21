package com.springboot.assignment;

import org.springframework.stereotype.Component;

@Component
public class AddNumbersImpl implements AddNumbers {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

}
