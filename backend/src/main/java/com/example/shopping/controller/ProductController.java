package com.example.shopping.controller;

import com.example.shopping.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:5173") // Allow frontend dev server
public class ProductController {

    @GetMapping
    public List<Product> getAllProducts() {
        // Return a hardcoded list of products for now
        return Arrays.asList(
            new Product("Laptop", "A powerful laptop for all your needs.", 1200.00, "https://via.placeholder.com/150"),
            new Product("Smartphone", "A smartphone with a great camera.", 800.00, "https://via.placeholder.com/150"),
            new Product("Headphones", "Noise-cancelling headphones.", 250.00, "https://via.placeholder.com/150"),
            new Product("Smartwatch", "A watch that does more than tell time.", 350.00, "https://via.placeholder.com/150")
        );
    }
}
