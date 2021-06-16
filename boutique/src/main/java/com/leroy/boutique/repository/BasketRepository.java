package com.leroy.boutique.repository;

import com.leroy.boutique.entity.Basket;
import com.leroy.boutique.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BasketRepository extends JpaRepository<Basket, Long> {

    Basket findBasketByClient(Client client);
}
