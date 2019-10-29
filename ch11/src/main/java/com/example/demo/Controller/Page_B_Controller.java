package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.vo.Product;
import com.example.demo.service.ProductService;

@Controller
public class Page_B_Controller {
	
	 @Autowired
	public ProductService productService;
	
	@PostMapping("/b/query")
	public String query(Model model, @RequestParam("productId") Integer productId) {
		if(productId == null) {
			model.addAttribute("text", "ProductId is null!!");
			return "c";
		}
		//取得資料
		Product product = productService.getProduct(productId);
		
        model.addAttribute("text", "This is a product page");      
        model.addAttribute("product", product);
		return "b";
	}
}
