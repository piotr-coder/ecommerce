package com.piotr.ecommerce.controller;

import com.piotr.ecommerce.dao.ProductRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class EnvCheck {
    private ProductRepository productRepository;

    public EnvCheck(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @RequestMapping("/env")
    public @ResponseBody Map<String, String> env() {
        System.out.println("Product 1: " + productRepository.findById(1L));
        return System.getenv();
    }
}
