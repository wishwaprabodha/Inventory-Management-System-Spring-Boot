package com.example.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product_invoice", schema = "ipaytest2", catalog = "")
public class ProductInvoiceEntity {
    private int refId;
    private int productProductId;
    private int invoiceInvoiceId;

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
}
