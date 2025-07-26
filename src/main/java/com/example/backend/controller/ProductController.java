package com.example.backend.controller;

import com.example.backend.model.Product;
import com.example.backend.repository.ProductRepository;
import com.example.backend.service.ProductService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Говорим: это REST-контроллер (возвращает JSON, а не HTML)
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    private final ProductRepository productRepository;

    // Внедрение зависимости сервиса
    public ProductController(ProductService productService, ProductRepository productRepository) {
        this.productService = productService;
        this.productRepository = productRepository;
    }

    // Получить все товары: GET /products
    @GetMapping
//    public String index(Model model) {
//        List<Product> products = productRepository.findAll();
//        model.addAttribute("products", products);
//        return "products";
//    }
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Добавить товар: POST /products
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    // Удалить товар: DELETE /products/{id}
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}

