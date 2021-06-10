package com.leroy.boutique.controller;

import com.leroy.boutique.entity.Bill;
import com.leroy.boutique.repository.BillRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillRepository BillRepository;

    @ApiOperation(value = "Get all bills")
    @GetMapping("")
    public List<Bill> getAllBills() {
        return BillRepository.findAll();
    }

    @ApiOperation(value = "Get bill by id")
    @GetMapping("/{id}")
    public Bill getBillById(@PathVariable Long id){
        return BillRepository.findById(id).get();
    }
}
