package com.multiplication.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MultiplicationServiceImpl implements MultiplicationService {

	@Override
	public Integer multiply(int num1, int num2) {
		return num1 * num2;
	}

}
