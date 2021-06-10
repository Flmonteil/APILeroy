package com.leroy.boutique.controller;

import com.leroy.boutique.entity.Order;
import com.leroy.boutique.repository.OrderRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository OrderRepository;

    @ApiOperation(value = "Get all Orders")
    @GetMapping("")
    public List<Order> getAllOrders() {
        return OrderRepository.findAll();
    }

    @ApiOperation(value = "Get Order by id")
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id){
        return OrderRepository.findById(id).get();
    }


}
