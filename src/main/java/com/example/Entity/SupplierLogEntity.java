package com.example.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "supplier_log", schema = "ipaytest2")
public class SupplierLogEntity {
    private int supplierId;
    private String supplierName;
    private Integer supplierContact;
    private String supplierCompany;
    private String createdUser;
    private Timestamp createdDateTime;
    private String lastModifiedUser;
    private Timestamp lastModifiedDateTime;
    private Integer version;

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
        SupplierLogEntity that = (SupplierLogEntity) o;
        return supplierId == that.supplierId &&
                Objects.equals(supplierName, that.supplierName) &&
                Objects.equals(supplierContact, that.supplierContact) &&
                Objects.equals(supplierCompany, that.supplierCompany) &&
                Objects.equals(createdUser, that.createdUser) &&
                Objects.equals(createdDateTime, that.createdDateTime) &&
                Objects.equals(lastModifiedUser, that.lastModifiedUser) &&
                Objects.equals(lastModifiedDateTime, that.lastModifiedDateTime) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {

        return Objects.hash(supplierId, supplierName, supplierContact, supplierCompany, createdUser, createdDateTime, lastModifiedUser, lastModifiedDateTime, version);
    }
}
