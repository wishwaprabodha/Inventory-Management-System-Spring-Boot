package com.example.Entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "invoice", schema = "ipaytest2")
public class InvoiceEntity {
    private int invoiceId;
    private Integer productId;
    private String productName;
    private Double quantity;
    private Double lineTotal;
    private Double total;
    private Integer version;
    private Collection<ProductInvoiceEntity> productInvoicesByInvoiceId;

    @Id
    @Column(name = "invoiceId")
    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
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
    @Column(name = "productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "quantity")
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "lineTotal")
    public Double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(Double lineTotal) {
        this.lineTotal = lineTotal;
    }

    @Basic
    @Column(name = "total")
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
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
        InvoiceEntity that = (InvoiceEntity) o;
        return invoiceId == that.invoiceId &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(lineTotal, that.lineTotal) &&
                Objects.equals(total, that.total) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {

        return Objects.hash(invoiceId, productId, productName, quantity, lineTotal, total, version);
    }

    @OneToMany(mappedBy = "invoiceByInvoiceInvoiceId")
    public Collection<ProductInvoiceEntity> getProductInvoicesByInvoiceId() {
        return productInvoicesByInvoiceId;
    }

    public void setProductInvoicesByInvoiceId(Collection<ProductInvoiceEntity> productInvoicesByInvoiceId) {
        this.productInvoicesByInvoiceId = productInvoicesByInvoiceId;
    }
}
