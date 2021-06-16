package com.leroy.boutique.repository;

import com.leroy.boutique.entity.Basket;
import com.leroy.boutique.entity.BasketProduct;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BasketProductRepository extends JpaRepository<BasketProduct, Long> {


    BasketProduct findBasketProductByBasket(Basket basket);
}
