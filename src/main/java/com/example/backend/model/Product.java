package com.example.backend.model;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String color;
    private int quantity;

    // Конструкторы
    public Product() {}

    public Product(String name, String color, int quantity) {
        this.name = name;
        this.color = color;
        this.quantity = quantity;
    }

    // Геттеры и сеттеры
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
}
