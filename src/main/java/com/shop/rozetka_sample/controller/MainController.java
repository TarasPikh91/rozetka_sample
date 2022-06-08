package com.shop.rozetka_sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String main() {
        return "/main";
    }

    @GetMapping("/add_product")
    public String addProduct() {
        return "/createProduct";
    }
}
