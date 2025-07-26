package com.example.backend.repository;

import com.example.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository (необязательно, но для читаемости добавим)
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Ничего не пишем — JpaRepository уже содержит все нужные CRUD-методы
}
