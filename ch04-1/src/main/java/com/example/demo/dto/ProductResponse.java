package com.example.demo.dto;

public class ProductResponse {
	public  ProductHeader header;
	public  ProductResponseBody body;
	public ProductHeader getHeader() {
		return header;
	}
	public void setHeader(ProductHeader header) {
		this.header = header;
	}
	public ProductResponseBody getBody() {
		return body;
	}
	public void setBody(ProductResponseBody body) {
		this.body = body;
	}
}
