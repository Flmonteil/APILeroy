package com.leroy.boutique.entity;

import javax.persistence.*;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_bill;

    @JoinColumn(name = "id_order")
    @OneToOne(cascade = CascadeType.ALL)
    private Order order;


    public Bill(Long id_bill, Order order) {
        this.id_bill = id_bill;
        this.order = order;

    }

    public Bill() {
    }

    public Long getId_bill() {
        return id_bill;
    }

    public void setId_bill(Long id_bill) {
        this.id_bill = id_bill;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
