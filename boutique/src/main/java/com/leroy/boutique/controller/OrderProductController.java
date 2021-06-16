package com.leroy.boutique.controller;

import com.leroy.boutique.entity.OrderProduct;
import com.leroy.boutique.repository.OrderProductRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orderproduct")
public class OrderProductController {

    @Autowired
    private OrderProductRepository OrderProductRepository;

    @ApiOperation(value = "Get all OrderProducts")
    @GetMapping("")
    public List<OrderProduct> getAllOrderProducts() {
        return OrderProductRepository.findAll();
    }

    @ApiOperation(value = "GetOrderProduct by id")
    @GetMapping("/{id}")
    public OrderProduct getOrderProductById(@PathVariable Long id){
        return OrderProductRepository.findById(id).get();
    }
}
