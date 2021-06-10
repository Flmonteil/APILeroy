package com.leroy.boutique.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BasketProduct {

    @EmbeddedId
    private BasketProductId id_basketproduct;

    private Long quantity;

    private Double total_amount;

    private Date date;


    public BasketProduct(){}

    public BasketProduct(BasketProductId id_basketproduct, Long quantity, Double total_amount, Date date) {
        this.id_basketproduct = id_basketproduct;
        this.quantity = quantity;
        this.total_amount = total_amount;
        this.date = date;
    }

    public Long getId_basket(){
        return getId_basketproduct().getId_basket();
    }

    public Long getId_product(){
        return getId_basketproduct().getId_product();
    }

    public BasketProductId getId_basketproduct() {
        return id_basketproduct;
    }

    public void setId_basketproduct(BasketProductId id_basketproduct) {
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
