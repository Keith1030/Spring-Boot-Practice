package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductResponse;

@RestController
public class ProductController {

	// ProductController(ch05:composite) => restTemplate(rest client) => ProductController(ch04:base) 
	@Value("${prod.base.url}")
	public String prodBaseUrl;

	@PostMapping("/prod")
	@ResponseBody
	public ProductResponse getProduct(@RequestBody ProductRequest request) {
		System.out.println(prodBaseUrl);
		return new RestTemplate().postForObject(prodBaseUrl, request, ProductResponse.class);
	}
}
