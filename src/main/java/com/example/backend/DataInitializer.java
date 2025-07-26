package com.example.backend;

import com.example.backend.model.Product;
import com.example.backend.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// Компонент, который выполнится один раз при запуске приложения
@Component
public class DataInitializer implements CommandLineRunner {

    private final ProductRepository repository;

    // Внедряем зависимость через конструктор
    public DataInitializer(ProductRepository repository) {
        this.repository = repository;
    }

    // Метод run() автоматически вызывается при старте приложения
    @Override
    public void run(String... args) {
        // Если в таблице ещё нет данных — добавим несколько товаров
        if (repository.count() == 0) {
            repository.save(new Product("Кружка", "Синий", 20));
            repository.save(new Product("Тарелка", "Белый", 15));
            repository.save(new Product("Ложка", "Серебро", 50));
            System.out.println("✅ Продукты добавлены в базу данных");
        } else {
            System.out.println("ℹ️ Продукты уже есть — пропускаем инициализацию");
        }
    }
}

