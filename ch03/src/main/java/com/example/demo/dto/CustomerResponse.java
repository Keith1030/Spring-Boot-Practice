package com.example.demo.dto;

public class CustomerResponse {
	public CustomerResponseHeader header;
	public CustomerResponseBody body;
	public CustomerResponseHeader getHeader() {
		return header;
	}
	public void setHeader(CustomerResponseHeader header) {
		this.header = header;
	}
	public CustomerResponseBody getBody() {
		return body;
	}
	public void setBody(CustomerResponseBody body) {
		this.body = body;
	}
}
