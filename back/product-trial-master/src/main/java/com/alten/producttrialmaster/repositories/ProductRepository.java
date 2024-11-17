package com.alten.producttrialmaster.repositories;

import com.alten.producttrialmaster.models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
