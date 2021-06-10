package com.leroy.boutique.repository;

import com.leroy.boutique.entity.BasketProduct;
import com.leroy.boutique.entity.BasketProductId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BasketProductRepository extends JpaRepository<BasketProduct, Long> {

}
