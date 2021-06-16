package com.leroy.boutique.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BasketProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_basketproduct;

    @OneToOne
    @JoinColumn(name = "id_basket")

    private Basket basket;

    @OneToOne
    @JoinColumn(name = "id_product")
    private Product product;

    private Long quantity;

    private Double total_amount;

    private Date date;


    public BasketProduct(){}

    public BasketProduct(Long id_basketproduct, Basket basket, Product product, Long quantity, Double total_amount, Date date) {
        this.id_basketproduct = id_basketproduct;
        this.basket = basket;
        this.product = product;
        this.quantity = quantity;
        this.total_amount = total_amount;
        this.date = date;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getId_basketproduct() {
        return id_basketproduct;
    }

    public void setId_basketproduct(Long id_basketproduct) {
        this.id_basketproduct = id_basketproduct;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
