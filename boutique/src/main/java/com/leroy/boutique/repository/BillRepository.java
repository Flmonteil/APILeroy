package com.leroy.boutique.repository;

import com.leroy.boutique.entity.Bill;
import com.leroy.boutique.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {

    Bill findBillByOrder(Order order);
}
