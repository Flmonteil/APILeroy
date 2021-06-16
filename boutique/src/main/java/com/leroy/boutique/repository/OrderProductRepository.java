package com.leroy.boutique.repository;

import com.leroy.boutique.entity.Order;
import com.leroy.boutique.entity.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {

    OrderProduct findOrderProductByOrder(Order order);
}
