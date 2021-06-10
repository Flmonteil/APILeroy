package com.leroy.boutique.controller;

import com.leroy.boutique.entity.BasketProduct;
import com.leroy.boutique.repository.*;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/basketproduct")
public class BasketProductController {

    @Autowired
    private BasketProductRepository BasketProductRepository;

    @Autowired
    private BasketRepository BasketRepository;

    @ApiOperation(value = "Get all BasketProducts")
    @GetMapping("")
    public List<BasketProduct> getAllBasketProducts() {
        return BasketProductRepository.findAll();
    }

    @ApiOperation(value = "Get BasketProduct by id")
    @GetMapping("/{id}")
    public BasketProduct getBasketProductById(@PathVariable Long id){
        return BasketProductRepository.findById(id).get();
    }


}
