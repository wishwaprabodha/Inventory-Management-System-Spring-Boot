package com.example.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_pricing", schema = "ipaytest2", catalog = "")
public class ProductPricingEntity {
    private int refId;
    private int pricingPricingId;
    private int productProductId;

    @Id
    @Column(name = "refId")
    public int getRefId() {
        return refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }

    @Basic
    @Column(name = "pricing_pricingId")
    public int getPricingPricingId() {
        return pricingPricingId;
    }

    public void setPricingPricingId(int pricingPricingId) {
        this.pricingPricingId = pricingPricingId;
    }

    @Basic
    @Column(name = "product_productId")
    public int getProductProductId() {
        return productProductId;
    }

    public void setProductProductId(int productProductId) {
        this.productProductId = productProductId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPricingEntity that = (ProductPricingEntity) o;
        return refId == that.refId &&
                pricingPricingId == that.pricingPricingId &&
                productProductId == that.productProductId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(refId, pricingPricingId, productProductId);
    }
}
