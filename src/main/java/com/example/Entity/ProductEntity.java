package com.example.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "ipaytest2")
public class ProductEntity {
    private int productId;
    private String productName;
    private Byte productIsService;
    private Double productbuyingPrice;
    private Double productsellingPrice;
    private Integer categoryId;
    private String createdUser;
    private Timestamp createdDateTime;
    private String lastModifiedUser;
    private Timestamp lastModifiedDateTime;
    private Integer version;
    private CategoryEntity categoryByCategoryId;
    private Collection<ProductInvoiceEntity> productInvoicesByProductId;
    private Collection<ProductPricingEntity> productPricingsByProductId;
    private Collection<StockEntity> stocksByProductId;

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
        ProductEntity that = (ProductEntity) o;
        return productId == that.productId &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(productIsService, that.productIsService) &&
                Objects.equals(productbuyingPrice, that.productbuyingPrice) &&
                Objects.equals(productsellingPrice, that.productsellingPrice) &&
                Objects.equals(categoryId, that.categoryId) &&
                Objects.equals(createdUser, that.createdUser) &&
                Objects.equals(createdDateTime, that.createdDateTime) &&
                Objects.equals(lastModifiedUser, that.lastModifiedUser) &&
                Objects.equals(lastModifiedDateTime, that.lastModifiedDateTime) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productId, productName, productIsService, productbuyingPrice, productsellingPrice, categoryId, createdUser, createdDateTime, lastModifiedUser, lastModifiedDateTime, version);
    }

    @ManyToOne
    @JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
    public CategoryEntity getCategoryByCategoryId() {
        return categoryByCategoryId;
    }

    public void setCategoryByCategoryId(CategoryEntity categoryByCategoryId) {
        this.categoryByCategoryId = categoryByCategoryId;
    }

    @OneToMany(mappedBy = "productByProductProductId")
    public Collection<ProductInvoiceEntity> getProductInvoicesByProductId() {
        return productInvoicesByProductId;
    }

    public void setProductInvoicesByProductId(Collection<ProductInvoiceEntity> productInvoicesByProductId) {
        this.productInvoicesByProductId = productInvoicesByProductId;
    }

    @OneToMany(mappedBy = "productByProductProductId")
    public Collection<ProductPricingEntity> getProductPricingsByProductId() {
        return productPricingsByProductId;
    }

    public void setProductPricingsByProductId(Collection<ProductPricingEntity> productPricingsByProductId) {
        this.productPricingsByProductId = productPricingsByProductId;
    }

    @OneToMany(mappedBy = "productByProductId")
    public Collection<StockEntity> getStocksByProductId() {
        return stocksByProductId;
    }

    public void setStocksByProductId(Collection<StockEntity> stocksByProductId) {
        this.stocksByProductId = stocksByProductId;
    }
}
