package com.example.demo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.respository.ProductRespository;
import com.example.demo.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	public ProductRespository productRespository;


	@Override
	public Product getProduct(Integer productId) {
		// TODO Auto-generated method stub
		return productRespository.getOne(productId);
	}


	@Override
	public List<Product> getProductAll() {
		// TODO Auto-generated method stub
		return productRespository.findAll();
	}

}
