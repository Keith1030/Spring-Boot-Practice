package com.example.demo.Controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.vo.Product;

@Controller
public class ProductController {

    @GetMapping("/prod")
    public String prod(Model model) {
        // 建立 Product 測試資料
        List<Product> dataList = new ArrayList<>();
        
        Product p1 = new Product();
        p1.setProductId(10);
        p1.setCode("10");
        p1.setName("產品10");
        p1.setUnitprice(BigDecimal.valueOf(12345678.456700));
        dataList.add(p1);
        
        Product p2 = new Product();
        p2.setProductId(20);
        p2.setCode("20");
        p2.setName("產品20");
        p2.setUnitprice(BigDecimal.valueOf(523236.214));
        dataList.add(p2);
        
        model.addAttribute("text", "This is product page.");
        model.addAttribute("product", dataList);
        return "product";
    }
}