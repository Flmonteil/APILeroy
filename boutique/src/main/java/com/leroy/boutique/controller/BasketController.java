package com.leroy.boutique.controller;


import com.leroy.boutique.entity.Basket;
import com.leroy.boutique.entity.Client;
import com.leroy.boutique.entity.Product;
import com.leroy.boutique.repository.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/basket")
public class BasketController {

    @Autowired
    private BasketRepository BasketRepository;

    @Autowired
    private ClientRepository ClientRepository;

    @ApiOperation(value = "Get all baskets")
    @GetMapping("")
    public List<Basket> getAllBaskets() {
        return BasketRepository.findAll();
    }

    @ApiOperation(value = "Get basket by id")
    @GetMapping("/{id}")
    public Basket getBasketById(@PathVariable Long id){
        return BasketRepository.findById(id).get();
    }





   /* @ApiOperation(value = "Add product to basket")
    @PostMapping("/add/{id}")
    public Basket addProductById(@PathVariable Long id) {
        return BasketRepository.
    }*/
}
