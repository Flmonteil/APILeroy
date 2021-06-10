package com.leroy.boutique.repository;

import com.leroy.boutique.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
