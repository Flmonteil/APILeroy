package com.leroy.boutique.entity;

import javax.persistence.*;

@Entity
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_orderproduct;

    @OneToOne
    @JoinColumn(name = "id_order")
    private Order order;

    @OneToOne
    @JoinColumn(name = "id_product")
    private Product product;

    private Long quantity;

    private Double total_amount;


    public OrderProduct() {
    }

    public OrderProduct(Order order, Product product, Long quantity, Double total_amount) {
        this.id_orderproduct = id_orderproduct;
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.total_amount = total_amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getId_orderproduct() {
        return id_orderproduct;
    }

    public void setId_orderproduct(Long id_orderproduct) {
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
