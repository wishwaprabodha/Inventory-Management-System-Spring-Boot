package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */

@Entity
@NamedQuery(name = "Pricing.add", query = "SELECT pr FROM Pricing pr")
public class Pricing implements Serializable {

    @Id
    private int pricingId;
    private String princingName;
    private double pricingDiscountPrecentage;
    private LocalDate pricingExpireDate;
    private String pricingCreatedUser;
    private LocalDateTime pricingCreatedDateTime;
    private String pricingModifiedUser;
    private LocalDateTime pricingModifiedDateTime;

    public Pricing(){

    }

    public Pricing(int pricingId, String princingName, double pricingDiscountPrecentage, LocalDate pricingExpireDate, String pricingCreatedUser, LocalDateTime pricingCreatedDateTime,
                   String pricingModifiedUser, LocalDateTime pricingModifiedDateTime) {
        this.pricingId = pricingId;
        this.princingName = princingName;
        this.pricingDiscountPrecentage = pricingDiscountPrecentage;
        this.pricingExpireDate = pricingExpireDate;
        this.pricingCreatedUser = pricingCreatedUser;
        this.pricingCreatedDateTime = pricingCreatedDateTime;
        this.pricingModifiedUser = pricingModifiedUser;
        this.pricingModifiedDateTime = pricingModifiedDateTime;
    }

    public int getPricingId() {
        return pricingId;
    }

    public void setPricingId(int pricingId) {
        this.pricingId = pricingId;
    }

    public String getPrincingName() {
        return princingName;
    }

    public void setPrincingName(String princingName) {
        this.princingName = princingName;
    }

    public double getPricingDiscountPrecentage() {
        return pricingDiscountPrecentage;
    }

    public void setPricingDiscountPrecentage(double pricingDiscountPrecentage) {
        this.pricingDiscountPrecentage = pricingDiscountPrecentage;
    }

    public LocalDate getPricingExpireDate() {
        return pricingExpireDate;
    }

    public void setPricingExpireDate(LocalDate pricingExpireDate) {
        this.pricingExpireDate = pricingExpireDate;
    }

    public String getPricingCreatedUser() {
        return pricingCreatedUser;
    }

    public void setPricingCreatedUser(String pricingCreatedUser) {
        this.pricingCreatedUser = pricingCreatedUser;
    }

    public LocalDateTime getPricingCreatedDateTime() {
        return pricingCreatedDateTime;
    }

    public void setPricingCreatedDateTime(LocalDateTime pricingCreatedDateTime) {
        this.pricingCreatedDateTime = pricingCreatedDateTime;
    }

    public String getPricingModifiedUser() {
        return pricingModifiedUser;
    }

    public void setPricingModifiedUser(String pricingModifiedUser) {
        this.pricingModifiedUser = pricingModifiedUser;
    }

    public LocalDateTime getPricingModifiedDateTime() {
        return pricingModifiedDateTime;
    }

    public void setPricingModifiedDateTime(LocalDateTime pricingModifiedDateTime) {
        this.pricingModifiedDateTime = pricingModifiedDateTime;
    }
}
