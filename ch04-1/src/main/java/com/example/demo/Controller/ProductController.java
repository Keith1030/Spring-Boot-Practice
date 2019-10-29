package com.example.demo.Controller;

import java.util.List;

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
import com.example.demo.dto.ProductList.ProductListResponse;
import com.example.demo.dto.ProductList.ProductListResponseBody;
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
		//建立response
		ProductResponse response = new ProductResponse();
		
		//建立response header並將request header放入
		ProductHeader header = new ProductHeader();
		BeanUtils.copyProperties(request.getHeader(), header);
		response.setHeader(header);
		
		//根據productId找到product
		Integer productId = request.getBody().getProductId();		
		Product product = productService.getProduct(productId);
		
		//建立response body並將product放入
		ProductResponseBody body = new ProductResponseBody();
		BeanUtils.copyProperties(product, body);		
		response.setBody(body);
		
		return response;
	}
	
	@PostMapping("/prodAll")
	@ResponseBody
	public ProductListResponse getProductAll(@RequestBody  ProductRequest request) {
		//建立response
		ProductListResponse response = new ProductListResponse();
		
		//建立response header並將request header放入
		ProductHeader header = new ProductHeader();
		BeanUtils.copyProperties(request.getHeader(), header);
		response.setHeader(header);
		
		List<Product> productList = productService.getProductAll();
		//建立response body並將product放入
		ProductListResponseBody body = new ProductListResponseBody();
//		BeanUtils.copyProperties(productList, body.prdouctList); not work
		body.setPrdouctList(productList);
		response.setBody(body);
		
		return response;
	}
}
