package com.example.demo.service;


import java.util.List;
import com.example.demo.vo.Product;


public interface ProductService {
	Product getProduct(Integer productId);
	List<Product> getProductList();
}
