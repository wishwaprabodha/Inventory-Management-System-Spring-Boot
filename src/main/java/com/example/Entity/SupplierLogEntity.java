package com.example.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "supplier_log", schema = "ipay")
public class SupplierLogEntity {
    private int supplierId;
    private String supplierName;
    private Integer supplierContact;
    private String supplierCompany;
    private String supplierCreatedUser;
    private Timestamp supplierCreatedDateTime;
    private String supplierModifiedUser;
    private Timestamp supplierModifiedDateTime;

    @Id
    @Column(name = "supplierId")
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column(name = "supplierName")
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Basic
    @Column(name = "supplierContact")
    public Integer getSupplierContact() {
        return supplierContact;
    }

    public void setSupplierContact(Integer supplierContact) {
        this.supplierContact = supplierContact;
    }

    @Basic
    @Column(name = "supplierCompany")
    public String getSupplierCompany() {
        return supplierCompany;
    }

    public void setSupplierCompany(String supplierCompany) {
        this.supplierCompany = supplierCompany;
    }

    @Basic
    @Column(name = "supplierCreatedUser")
    public String getSupplierCreatedUser() {
        return supplierCreatedUser;
    }

    public void setSupplierCreatedUser(String supplierCreatedUser) {
        this.supplierCreatedUser = supplierCreatedUser;
    }

    @Basic
    @Column(name = "supplierCreatedDateTime")
    public Timestamp getSupplierCreatedDateTime() {
        return supplierCreatedDateTime;
    }

    public void setSupplierCreatedDateTime(Timestamp supplierCreatedDateTime) {
        this.supplierCreatedDateTime = supplierCreatedDateTime;
    }

    @Basic
    @Column(name = "supplierModifiedUser")
    public String getSupplierModifiedUser() {
        return supplierModifiedUser;
    }

    public void setSupplierModifiedUser(String supplierModifiedUser) {
        this.supplierModifiedUser = supplierModifiedUser;
    }

    @Basic
    @Column(name = "supplierModifiedDateTime")
    public Timestamp getSupplierModifiedDateTime() {
        return supplierModifiedDateTime;
    }

    public void setSupplierModifiedDateTime(Timestamp supplierModifiedDateTime) {
        this.supplierModifiedDateTime = supplierModifiedDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierLogEntity that = (SupplierLogEntity) o;
        return supplierId == that.supplierId &&
                Objects.equals(supplierName, that.supplierName) &&
                Objects.equals(supplierContact, that.supplierContact) &&
                Objects.equals(supplierCompany, that.supplierCompany) &&
                Objects.equals(supplierCreatedUser, that.supplierCreatedUser) &&
                Objects.equals(supplierCreatedDateTime, that.supplierCreatedDateTime) &&
                Objects.equals(supplierModifiedUser, that.supplierModifiedUser) &&
                Objects.equals(supplierModifiedDateTime, that.supplierModifiedDateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(supplierId, supplierName, supplierContact, supplierCompany, supplierCreatedUser, supplierCreatedDateTime, supplierModifiedUser, supplierModifiedDateTime);
    }
}
