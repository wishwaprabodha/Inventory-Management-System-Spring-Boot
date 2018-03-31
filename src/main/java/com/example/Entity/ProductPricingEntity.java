package com.example.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_pricing", schema = "ipaytest2")
public class ProductPricingEntity {
    private int refId;
    private int pricingPricingId;
    private int productProductId;
    private PricingEntity pricingByPricingPricingId;
    private ProductEntity productByProductProductId;

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

    @ManyToOne
    @JoinColumn(name = "pricing_pricingId", referencedColumnName = "pricingId", nullable = false)
    public PricingEntity getPricingByPricingPricingId() {
        return pricingByPricingPricingId;
    }

    public void setPricingByPricingPricingId(PricingEntity pricingByPricingPricingId) {
        this.pricingByPricingPricingId = pricingByPricingPricingId;
    }

    @ManyToOne
    @JoinColumn(name = "product_productId", referencedColumnName = "productId", nullable = false)
    public ProductEntity getProductByProductProductId() {
        return productByProductProductId;
    }

    public void setProductByProductProductId(ProductEntity productByProductProductId) {
        this.productByProductProductId = productByProductProductId;
    }
}
