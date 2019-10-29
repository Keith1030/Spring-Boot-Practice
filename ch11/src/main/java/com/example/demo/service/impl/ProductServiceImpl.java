package com.example.demo.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.ProductHeader;
import com.example.demo.dto.ProductRequest;
import com.example.demo.dto.ProductRequestBody;
import com.example.demo.dto.ProductResponse;
import com.example.demo.dto.ProductList.ProductListResponse;
import com.example.demo.vo.Product;
import com.example.demo.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
	@Value("${prod.base.url}")
	public String prodBaseUrl;
	@Value("${prod.base.url2}")
	public String prodBaseUrl2;
	
//	@Autowired
//	public ProductRespository productRespository;

	@Override
	public Product getProduct(Integer productId) {
		// TODO Auto-generated method stub
		//假request
		ProductRequest request = new ProductRequest();
		ProductHeader requestHeader = new ProductHeader();
		ProductRequestBody requestBody = new ProductRequestBody();
		requestBody.setProductId(productId);
		request.setHeader(requestHeader);
		request.setBody(requestBody);
		// 跟ch05拿資料
		ProductResponse response = new RestTemplate().postForObject(prodBaseUrl, request, ProductResponse.class);
		Product product = new Product();
//		product.setProductId(response.getBody().getProductId());
//		product.setCode(response.getBody().getCode());
//		product.setName(response.getBody().getName());
//		product.setUnitprice(response.getBody().getUnitprice());
		BeanUtils.copyProperties(response.getBody(), product);
		return product;
	}

	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		//假request
		ProductRequest request = new ProductRequest();
		ProductHeader requestHeader = new ProductHeader();
		ProductRequestBody requestBody = new ProductRequestBody();
		request.setHeader(requestHeader);
		request.setBody(requestBody);
		// 跟ch4-1拿資料(ch05跟ch04沒串)
		ProductListResponse response = new RestTemplate().postForObject(prodBaseUrl2, request, ProductListResponse.class);
		return response.getBody().getPrdouctList();
	}

}
