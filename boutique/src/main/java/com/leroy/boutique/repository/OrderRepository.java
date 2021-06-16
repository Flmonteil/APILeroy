package com.leroy.boutique.repository;

import com.leroy.boutique.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findOrdersByClient(Client client);
    Order findOrderByClient(Client client);

}
