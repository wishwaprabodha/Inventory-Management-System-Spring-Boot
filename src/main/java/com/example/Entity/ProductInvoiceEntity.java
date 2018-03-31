package com.example.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_invoice", schema = "ipaytest2")
public class ProductInvoiceEntity {
    private int refId;
    private int productProductId;
    private int invoiceInvoiceId;
    private ProductEntity productByProductProductId;
    private InvoiceEntity invoiceByInvoiceInvoiceId;

    @Id
    @Column(name = "refId")
    public int getRefId() {
        return refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }

    @Basic
    @Column(name = "product_productId")
    public int getProductProductId() {
        return productProductId;
    }

    public void setProductProductId(int productProductId) {
        this.productProductId = productProductId;
    }

    @Basic
    @Column(name = "invoice_invoiceId")
    public int getInvoiceInvoiceId() {
        return invoiceInvoiceId;
    }

    public void setInvoiceInvoiceId(int invoiceInvoiceId) {
        this.invoiceInvoiceId = invoiceInvoiceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductInvoiceEntity that = (ProductInvoiceEntity) o;
        return refId == that.refId &&
                productProductId == that.productProductId &&
                invoiceInvoiceId == that.invoiceInvoiceId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(refId, productProductId, invoiceInvoiceId);
    }

    @ManyToOne
    @JoinColumn(name = "product_productId", referencedColumnName = "productId", nullable = false)
    public ProductEntity getProductByProductProductId() {
        return productByProductProductId;
    }

    public void setProductByProductProductId(ProductEntity productByProductProductId) {
        this.productByProductProductId = productByProductProductId;
    }

    @ManyToOne
    @JoinColumn(name = "invoice_invoiceId", referencedColumnName = "invoiceId", nullable = false)
    public InvoiceEntity getInvoiceByInvoiceInvoiceId() {
        return invoiceByInvoiceInvoiceId;
    }

    public void setInvoiceByInvoiceInvoiceId(InvoiceEntity invoiceByInvoiceInvoiceId) {
        this.invoiceByInvoiceInvoiceId = invoiceByInvoiceInvoiceId;
    }
}
