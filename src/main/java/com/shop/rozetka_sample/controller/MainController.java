package com.shop.rozetka_sample.controller;

import com.shop.rozetka_sample.application.ProductApp;
import com.shop.rozetka_sample.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {


    private ProductApp productApp;

    public MainController(ProductApp productApp) {
        this.productApp = productApp;
    }

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("products", productApp.getProducts());
        return "/main";
    }
}
