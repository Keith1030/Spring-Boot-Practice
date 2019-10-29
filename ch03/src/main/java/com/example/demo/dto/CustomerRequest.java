package com.example.demo.dto;

public class CustomerRequest {

	public CustomerRequestHeader getHeader() {
		return header;
	}
	public void setHeader(CustomerRequestHeader header) {
		this.header = header;
	}
	public CustomerRequestBody getBody() {
		return body;
	}
	public void setBody(CustomerRequestBody body) {
		this.body = body;
	}
	public CustomerRequestHeader header;
	public CustomerRequestBody body;
}
