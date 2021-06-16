package com.leroy.boutique.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_basket;

    @JoinColumn(name = "id_client")
    @OneToOne(cascade = CascadeType.ALL)
    private Client client;


    public Basket(Long id_basket, Client client) {
        this.id_basket = id_basket;
        this.client = client;
    }

    public Long getId_basket() {
        return id_basket;
    }

    public void setId_basket(Long id_basket) {
        this.id_basket = id_basket;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Basket(){};
}
