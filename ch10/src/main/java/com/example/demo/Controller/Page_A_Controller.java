package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Page_A_Controller {
	@GetMapping("/a")
	public String a(Model model) {
        model.addAttribute("text", "This is a page A");
		return "a";
	}
}
