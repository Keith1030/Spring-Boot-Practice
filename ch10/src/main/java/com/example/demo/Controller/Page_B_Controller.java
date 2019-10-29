package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.vo.Page;

@Controller
public class Page_B_Controller {
//	@PostMapping("/b/query")
//	public String query(Model model, @RequestParam("pageName") String pageName) {
//		System.err.print("123");
//        model.addAttribute("text", "This is a page B");
//        model.addAttribute("pageName", pageName);
//		return "b";
//	}
	@PostMapping("/b/query")
	public String query(Model model, Page page) {
		System.err.print(page.pageName);
        model.addAttribute("text", "This is a page B");
        model.addAttribute("pageName", page.pageName);
		return "b";
	}
}
