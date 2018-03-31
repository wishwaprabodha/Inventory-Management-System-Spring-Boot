package com.example.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product_log", schema = "ipaytest2")
public class ProductLogEntity {
    private int productId;
    private String productName;
    private Byte productIsService;
    private Double productbuyingPrice;
    private Double productsellingPrice;
    private Integer pricingId;
    private Integer categoryId;
    private String createdUser;
    private Timestamp createdDateTime;
    private String lastModifiedUser;
    private Timestamp lastModifiedDateTime;
    private Integer version;

    @Id
    @Column(name = "productId")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "productIsService")
    public Byte getProductIsService() {
        return productIsService;
    }

    public void setProductIsService(Byte productIsService) {
        this.productIsService = productIsService;
    }

    @Basic
    @Column(name = "productbuyingPrice")
    public Double getProductbuyingPrice() {
        return productbuyingPrice;
    }

    public void setProductbuyingPrice(Double productbuyingPrice) {
        this.productbuyingPrice = productbuyingPrice;
    }

    @Basic
    @Column(name = "productsellingPrice")
    public Double getProductsellingPrice() {
        return productsellingPrice;
    }

    public void setProductsellingPrice(Double productsellingPrice) {
        this.productsellingPrice = productsellingPrice;
    }

    @Basic
    @Column(name = "pricingId")
    public Integer getPricingId() {
        return pricingId;
    }

    public void setPricingId(Integer pricingId) {
        this.pricingId = pricingId;
    }

    @Basic
    @Column(name = "categoryId")
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "CreatedUser")
    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    @Basic
    @Column(name = "CreatedDateTime")
    public Timestamp getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Timestamp createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    @Basic
    @Column(name = "LastModifiedUser")
    public String getLastModifiedUser() {
        return lastModifiedUser;
    }

    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    @Basic
    @Column(name = "LastModifiedDateTime")
    public Timestamp getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(Timestamp lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    @Basic
    @Column(name = "VERSION")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductLogEntity that = (ProductLogEntity) o;
        return productId == that.productId &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(productIsService, that.productIsService) &&
                Objects.equals(productbuyingPrice, that.productbuyingPrice) &&
                Objects.equals(productsellingPrice, that.productsellingPrice) &&
                Objects.equals(pricingId, that.pricingId) &&
                Objects.equals(categoryId, that.categoryId) &&
                Objects.equals(createdUser, that.createdUser) &&
                Objects.equals(createdDateTime, that.createdDateTime) &&
                Objects.equals(lastModifiedUser, that.lastModifiedUser) &&
                Objects.equals(lastModifiedDateTime, that.lastModifiedDateTime) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productId, productName, productIsService, productbuyingPrice, productsellingPrice, pricingId, categoryId, createdUser, createdDateTime, lastModifiedUser, lastModifiedDateTime, version);
    }
}
