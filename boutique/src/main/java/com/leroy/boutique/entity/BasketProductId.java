package com.leroy.boutique.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BasketProductId implements Serializable {

    private Long id_product;

    private Long id_basket;

    public BasketProductId(Long id_product, Long id_basket) {
        this.id_product = id_product;
        this.id_basket = id_basket;
    }

    public BasketProductId() {
    }

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public Long getId_basket() {
        return id_basket;
    }

    public void setId_basket(Long id_basket) {
        this.id_basket = id_basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasketProductId)) return false;
        BasketProductId that = (BasketProductId) o;
        return Objects.equals(getId_basket(), that.getId_basket()) &&
                Objects.equals(getId_product(), that.getId_product());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId_basket(), getId_product());
    }

}
