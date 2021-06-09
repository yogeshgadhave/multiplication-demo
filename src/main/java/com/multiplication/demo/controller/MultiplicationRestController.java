package com.multiplication.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.multiplication.demo.response.Response;
import com.multiplication.demo.service.MultiplicationService;

@RestController
public class MultiplicationRestController {

	@Autowired
	private MultiplicationService multiplicationService;
	
	@GetMapping(value="/multiply")
	public Response multiply(@RequestParam Integer numA,@RequestParam Integer numB) {
		Integer multiply = multiplicationService.multiply(numA, numB);
		return new Response(multiply.toString());
	}
	
}
