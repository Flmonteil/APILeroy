package com.leroy.boutique.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class OrderProduct {

    @EmbeddedId
    private OrderProductId id_orderproduct;

    private Long quantity;

    private Double total_amount;


    public OrderProduct() {
    }

    public OrderProduct(OrderProductId id_orderproduct, Long quantity, Double total_amount) {
        this.id_orderproduct = id_orderproduct;
        this.quantity = quantity;
        this.total_amount = total_amount;
    }


    public OrderProductId getId_orderproduct() {
        return id_orderproduct;
    }

    public void setId_orderproduct(OrderProductId id_orderproduct) {
        this.id_orderproduct = id_orderproduct;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Double total_amount) {
        this.total_amount = total_amount;
    }
}
