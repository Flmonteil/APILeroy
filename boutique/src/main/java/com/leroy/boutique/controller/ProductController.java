package com.leroy.boutique.controller;

import com.leroy.boutique.entity.Product;
import com.leroy.boutique.repository.ProductRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository ProductRepository;

    @ApiOperation(value = "Get all products")
    @GetMapping("")
    public List<Product> getAllProducts() {
        return ProductRepository.findAll();
    }

    @ApiOperation(value = "Get products by id")
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id){
        return ProductRepository.findById(id).get();
    }



}
