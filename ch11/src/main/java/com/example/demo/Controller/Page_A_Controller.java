package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.ProductService;
import com.example.demo.vo.Product;


@Controller
public class Page_A_Controller {
	
	 @Autowired
	public ProductService productService;
	
	@GetMapping("/a")
	public String a(Model model) {
		List<Product> productList = productService.getProductList();
		System.err.print("111");
        model.addAttribute("text", "This is a page A");
        model.addAttribute("productList", productList);
		return "a";
	}
}