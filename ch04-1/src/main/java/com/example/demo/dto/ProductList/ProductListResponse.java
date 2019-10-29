package com.example.demo.dto.ProductList;

import com.example.demo.dto.ProductHeader;

public class ProductListResponse {
	public ProductHeader header;
	public ProductListResponseBody body;
	public ProductHeader getHeader() {
		return header;
	}
	public void setHeader(ProductHeader header) {
		this.header = header;
	}
	public ProductListResponseBody getBody() {
		return body;
	}
	public void setBody(ProductListResponseBody body) {
		this.body = body;
	}
}
