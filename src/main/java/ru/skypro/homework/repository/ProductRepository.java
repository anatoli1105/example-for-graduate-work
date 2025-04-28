package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.skypro.homework.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
