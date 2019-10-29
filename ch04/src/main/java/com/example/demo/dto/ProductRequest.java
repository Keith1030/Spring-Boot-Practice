package com.example.demo.dto;

public class ProductRequest {
	public ProductHeader header;
	public ProductRequestBody body;
	public ProductHeader getHeader() {
		return header;
	}
	public void setHeader(ProductHeader header) {
		this.header = header;
	}
	public ProductRequestBody getBody() {
		return body;
	}
	public void setBody(ProductRequestBody body) {
		this.body = body;
	}
	
}
