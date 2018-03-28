package com.example.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "product_log", schema = "ipay")
public class ProductLogEntity {
    private int productId;
    private String productName;
    private Byte productIsService;
    private Double productbuyingPrice;
    private Double productsellingPrice;
    private Integer pricingId;
    private Integer categoryId;
    private String productCreatedUser;
    private Timestamp productCreatedDateTime;
    private String productModifiedUser;
    private Timestamp productModifiedDateTime;
    private PricingEntity pricingByPricingId;
    private CategoryEntity categoryByCategoryId;

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
    @Column(name = "productCreatedUser")
    public String getProductCreatedUser() {
        return productCreatedUser;
    }

    public void setProductCreatedUser(String productCreatedUser) {
        this.productCreatedUser = productCreatedUser;
    }

    @Basic
    @Column(name = "productCreatedDateTime")
    public Timestamp getProductCreatedDateTime() {
        return productCreatedDateTime;
    }

    public void setProductCreatedDateTime(Timestamp productCreatedDateTime) {
        this.productCreatedDateTime = productCreatedDateTime;
    }

    @Basic
    @Column(name = "productModifiedUser")
    public String getProductModifiedUser() {
        return productModifiedUser;
    }

    public void setProductModifiedUser(String productModifiedUser) {
        this.productModifiedUser = productModifiedUser;
    }

    @Basic
    @Column(name = "productModifiedDateTime")
    public Timestamp getProductModifiedDateTime() {
        return productModifiedDateTime;
    }

    public void setProductModifiedDateTime(Timestamp productModifiedDateTime) {
        this.productModifiedDateTime = productModifiedDateTime;
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
                Objects.equals(productCreatedUser, that.productCreatedUser) &&
                Objects.equals(productCreatedDateTime, that.productCreatedDateTime) &&
                Objects.equals(productModifiedUser, that.productModifiedUser) &&
                Objects.equals(productModifiedDateTime, that.productModifiedDateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productId, productName, productIsService, productbuyingPrice, productsellingPrice, pricingId, categoryId, productCreatedUser, productCreatedDateTime, productModifiedUser, productModifiedDateTime);
    }

    @ManyToOne
    @JoinColumn(name = "pricingId", referencedColumnName = "pricingId")
    public PricingEntity getPricingByPricingId() {
        return pricingByPricingId;
    }

    public void setPricingByPricingId(PricingEntity pricingByPricingId) {
        this.pricingByPricingId = pricingByPricingId;
    }

    @ManyToOne
    @JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
    public CategoryEntity getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(CategoryEntity categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }
}
