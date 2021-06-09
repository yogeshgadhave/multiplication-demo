package com.multiplication.demo.response;

import java.io.Serializable;

public class Response implements Serializable {
     
	private String result;
	
	public Response() {
		super();
	}
	
	public Response(String result) {
		this.result = result;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
}
