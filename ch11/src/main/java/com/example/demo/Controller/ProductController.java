package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.ProductService;
import com.example.demo.vo.Product;

@Controller
public class ProductController {

	@Autowired
	public ProductService productService;
	
	@GetMapping("/prod")
	public String prod(Model model) {
        model.addAttribute("text", "This is a page A");
        List<Product> productList = productService.getProductAll();
        model.addAttribute("productList", productList);
		return "product";
	}
}
