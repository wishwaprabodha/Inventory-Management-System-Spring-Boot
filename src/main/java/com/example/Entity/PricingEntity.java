package com.example.Entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "pricing", schema = "ipay")
public class PricingEntity {
    private int pricingId;
    private String pricingName;
    private Integer pricingDiscountPrecentage;
    private Date pricingEffectiveDate;
    private Date pricingExpireDate;
    private String pricingCreatedUser;
    private Timestamp pricingCreatedDateTime;
    private String pricingModifiedUser;
    private Timestamp pricingModifiedDateTime;
    private Collection<ProductEntity> productsByPricingId;
    private Collection<ProductLogEntity> productLogsByPricingId;

    @Id
    @Column(name = "pricingId")
    public int getPricingId() {
        return pricingId;
    }

    public void setPricingId(int pricingId) {
        this.pricingId = pricingId;
    }

    @Basic
    @Column(name = "pricingName")
    public String getPricingName() {
        return pricingName;
    }

    public void setPricingName(String pricingName) {
        this.pricingName = pricingName;
    }

    @Basic
    @Column(name = "pricingDiscountPrecentage")
    public Integer getPricingDiscountPrecentage() {
        return pricingDiscountPrecentage;
    }

    public void setPricingDiscountPrecentage(Integer pricingDiscountPrecentage) {
        this.pricingDiscountPrecentage = pricingDiscountPrecentage;
    }

    @Basic
    @Column(name = "pricingEffectiveDate")
    public Date getPricingEffectiveDate() {
        return pricingEffectiveDate;
    }

    public void setPricingEffectiveDate(Date pricingEffectiveDate) {
        this.pricingEffectiveDate = pricingEffectiveDate;
    }

    @Basic
    @Column(name = "pricingExpireDate")
    public Date getPricingExpireDate() {
        return pricingExpireDate;
    }

    public void setPricingExpireDate(Date pricingExpireDate) {
        this.pricingExpireDate = pricingExpireDate;
    }

    @Basic
    @Column(name = "pricingCreatedUser")
    public String getPricingCreatedUser() {
        return pricingCreatedUser;
    }

    public void setPricingCreatedUser(String pricingCreatedUser) {
        this.pricingCreatedUser = pricingCreatedUser;
    }

    @Basic
    @Column(name = "pricingCreatedDateTime")
    public Timestamp getPricingCreatedDateTime() {
        return pricingCreatedDateTime;
    }

    public void setPricingCreatedDateTime(Timestamp pricingCreatedDateTime) {
        this.pricingCreatedDateTime = pricingCreatedDateTime;
    }

    @Basic
    @Column(name = "pricingModifiedUser")
    public String getPricingModifiedUser() {
        return pricingModifiedUser;
    }

    public void setPricingModifiedUser(String pricingModifiedUser) {
        this.pricingModifiedUser = pricingModifiedUser;
    }

    @Basic
    @Column(name = "pricingModifiedDateTime")
    public Timestamp getPricingModifiedDateTime() {
        return pricingModifiedDateTime;
    }

    public void setPricingModifiedDateTime(Timestamp pricingModifiedDateTime) {
        this.pricingModifiedDateTime = pricingModifiedDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PricingEntity that = (PricingEntity) o;
        return pricingId == that.pricingId &&
                Objects.equals(pricingName, that.pricingName) &&
                Objects.equals(pricingDiscountPrecentage, that.pricingDiscountPrecentage) &&
                Objects.equals(pricingEffectiveDate, that.pricingEffectiveDate) &&
                Objects.equals(pricingExpireDate, that.pricingExpireDate) &&
                Objects.equals(pricingCreatedUser, that.pricingCreatedUser) &&
                Objects.equals(pricingCreatedDateTime, that.pricingCreatedDateTime) &&
                Objects.equals(pricingModifiedUser, that.pricingModifiedUser) &&
                Objects.equals(pricingModifiedDateTime, that.pricingModifiedDateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pricingId, pricingName, pricingDiscountPrecentage, pricingEffectiveDate, pricingExpireDate, pricingCreatedUser, pricingCreatedDateTime, pricingModifiedUser, pricingModifiedDateTime);
    }

    @OneToMany(mappedBy = "pricingByPricingId")
    public Collection<ProductEntity> getProductsByPricingId() {
        return productsByPricingId;
    }

    public void setProductsByPricingId(Collection<ProductEntity> productsByPricingId) {
        this.productsByPricingId = productsByPricingId;
    }

    @OneToMany(mappedBy = "pricingByPricingId")
    public Collection<ProductLogEntity> getProductLogsByPricingId() {
        return productLogsByPricingId;
    }

    public void setProductLogsByPricingId(Collection<ProductLogEntity> productLogsByPricingId) {
        this.productLogsByPricingId = productLogsByPricingId;
    }
}
