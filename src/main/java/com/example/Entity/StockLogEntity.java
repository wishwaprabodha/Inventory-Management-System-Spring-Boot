package com.example.Entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "stock_log", schema = "ipay")
public class StockLogEntity {
    private int refId;
    private Integer stockId;
    private Integer supplierId;
    private Integer productId;
    private Integer categoryId;
    private Integer quantity;
    private Date dateStock;
    private String stockCreatedUser;
    private Timestamp stockCreatedDateTime;
    private String stockModifiedUser;
    private Timestamp stockModifiedDateTime;
    private SupplierEntity supplierBySupplierId;
    private ProductEntity productByProductId;
    private CategoryEntity categoryByCategoryId;

    @Id
    @Column(name = "refId")
    public int getRefId() {
        return refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }

    @Basic
    @Column(name = "stockId")
    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    @Basic
    @Column(name = "supplierId")
    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "productId")
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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
    @Column(name = "quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "dateStock")
    public Date getDateStock() {
        return dateStock;
    }

    public void setDateStock(Date dateStock) {
        this.dateStock = dateStock;
    }

    @Basic
    @Column(name = "stockCreatedUser")
    public String getStockCreatedUser() {
        return stockCreatedUser;
    }

    public void setStockCreatedUser(String stockCreatedUser) {
        this.stockCreatedUser = stockCreatedUser;
    }

    @Basic
    @Column(name = "stockCreatedDateTime")
    public Timestamp getStockCreatedDateTime() {
        return stockCreatedDateTime;
    }

    public void setStockCreatedDateTime(Timestamp stockCreatedDateTime) {
        this.stockCreatedDateTime = stockCreatedDateTime;
    }

    @Basic
    @Column(name = "stockModifiedUser")
    public String getStockModifiedUser() {
        return stockModifiedUser;
    }

    public void setStockModifiedUser(String stockModifiedUser) {
        this.stockModifiedUser = stockModifiedUser;
    }

    @Basic
    @Column(name = "stockModifiedDateTime")
    public Timestamp getStockModifiedDateTime() {
        return stockModifiedDateTime;
    }

    public void setStockModifiedDateTime(Timestamp stockModifiedDateTime) {
        this.stockModifiedDateTime = stockModifiedDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockLogEntity that = (StockLogEntity) o;
        return refId == that.refId &&
                Objects.equals(stockId, that.stockId) &&
                Objects.equals(supplierId, that.supplierId) &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(categoryId, that.categoryId) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(dateStock, that.dateStock) &&
                Objects.equals(stockCreatedUser, that.stockCreatedUser) &&
                Objects.equals(stockCreatedDateTime, that.stockCreatedDateTime) &&
                Objects.equals(stockModifiedUser, that.stockModifiedUser) &&
                Objects.equals(stockModifiedDateTime, that.stockModifiedDateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(refId, stockId, supplierId, productId, categoryId, quantity, dateStock, stockCreatedUser, stockCreatedDateTime, stockModifiedUser, stockModifiedDateTime);
    }

    @ManyToOne
    @JoinColumn(name = "supplierId", referencedColumnName = "supplierId")
    public SupplierEntity getSupplierBySupplierId() {
        return supplierBySupplierId;
    }

    public void setSupplierBySupplierId(SupplierEntity supplierBySupplierId) {
        this.supplierBySupplierId = supplierBySupplierId;
    }

    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "productId")
    public ProductEntity getProductByProductId() {
        return productByProductId;
    }

    public void setProductByProductId(ProductEntity productByProductId) {
        this.productByProductId = productByProductId;
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
