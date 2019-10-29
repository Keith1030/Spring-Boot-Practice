package com.example.demo.Controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductHeader;
import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductResponse;
import com.example.demo.dto.ProductResponseBody;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	
	// controller > service > respository
	
	@Autowired
	public ProductService productService;


	@PostMapping("/prod")
	@ResponseBody
	public ProductResponse getProduct(@RequestBody  ProductRequest request) {
		System.out.println(request);
		ProductResponse response = new ProductResponse();
		
		ProductHeader header = new ProductHeader();
		BeanUtils.copyProperties(request.getHeader(), header);
		response.setHeader(header);
		
		Integer productId = request.getBody().getProductId();		
		Product product = productService.getProduct(productId);
		
		ProductResponseBody body = new ProductResponseBody();
//		body.setCode(product.getCode());
//		body.setName(product.getName());
//		body.setProductId(product.getProductId());
//		body.setUnitprice(product.getUnitPrice());
		BeanUtils.copyProperties(product, body);
		
		response.setBody(body);		
		return response;
	}
}
