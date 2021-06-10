package com.leroy.boutique.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderProductId implements Serializable {

    private Long id_product;

    private Long id_order;

    public OrderProductId(Long id_product, Long id_order) {
        this.id_product = id_product;
        this.id_order = id_order;
    }

    public OrderProductId() {
    }

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public Long getId_order() {
        return id_order;
    }

    public void setId_order(Long id_order) {
        this.id_order = id_order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderProductId)) return false;
        OrderProductId that = (OrderProductId) o;
        return Objects.equals(getId_order(), that.getId_order()) &&
                Objects.equals(getId_product(), that.getId_product());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId_order(), getId_product());
    }

}
