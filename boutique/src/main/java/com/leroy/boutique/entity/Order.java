package com.leroy.boutique.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_order;

    @JoinColumn(name = "id_client")
    @ManyToOne(cascade = CascadeType.ALL)
    private Client client;

    private Double total_amount;

    private Date date;

    public Order(Long id_order, Client client, Double total_amount, Date date) {
        this.id_order = id_order;
        this.client = client;
        this.total_amount = total_amount;
        this.date = date;
    }

    public Order(){}

    public Long getId_order() {
        return id_order;
    }

    public void setId_order(Long id_order) {
        this.id_order = id_order;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
