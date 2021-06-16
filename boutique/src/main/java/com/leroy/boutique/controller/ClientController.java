package com.leroy.boutique.controller;

import com.leroy.boutique.entity.Client;
import com.leroy.boutique.repository.ClientRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository ClientRepository;

    @ApiOperation(value = "Get all clients")
    @GetMapping("")
    public List<Client> getAllClients() {
        return ClientRepository.findAll();
    }

    @ApiOperation(value = "Get client by id")
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id){
        return ClientRepository.findById(id).get();
    }
}
