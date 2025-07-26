package com.example.backend.service;

import com.example.backend.model.Product;
import com.example.backend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// @Service говорит Spring'у: это компонент бизнес-логики
@Service
public class ProductService {

    private final ProductRepository productRepository;

    // Внедрение зависимости через конструктор
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Получить все товары
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Сохранить (добавить) товар
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Удалить товар по ID
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    // Получить товар по ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }
}
