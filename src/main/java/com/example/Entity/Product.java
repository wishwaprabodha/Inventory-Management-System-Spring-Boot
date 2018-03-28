package com.example.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by Wishwa Prabodha on 3/23/2018.
 */
@Entity
@NamedQuery(name = "Product.add", query = "SELECT p FROM Product p")

public class Product implements Serializable{

    @Id
    private int productId;
    private String productName;
    private boolean productIsService;
    private double  productBuyingPrice;
    private double  productSellingPrice;
    private String productCreatedUser;
    private int categoryId;
    private LocalDateTime productCreatedDateTime;
    private String productModifiedUser;
    private LocalDateTime productModifiedDateTime;


    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToOne
    private Pricing pricing;

    public Category getCategory() {
        return category;
    }
    public Pricing getPricing() {
        return pricing;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }


    public Product(int productId, String productName, boolean productIsService, double productBuyingPrice, double productSellingPrice, String productCreatedUser, LocalDateTime productCreatedDateTime, String productModifiedUser,
                   LocalDateTime productModifiedDateTime, Category category, Pricing pricing) {
        this.productId = productId;
        this.productName = productName;
        this.productIsService = productIsService;
        this.productBuyingPrice = productBuyingPrice;
        this.productSellingPrice = productSellingPrice;
        this.productCreatedUser = productCreatedUser;
        this.productCreatedDateTime = productCreatedDateTime;
        this.productModifiedUser = productModifiedUser;
        this.productModifiedDateTime = productModifiedDateTime;
        this.category = category;
        this.pricing = pricing;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int  id) {
        this.productId = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String name) {
        this.productName = name;
    }

    public boolean isProductIsService() {
        return productIsService;
    }

    public void setProductIsService(boolean productIsService) {
        this.productIsService = productIsService;
    }

    public double getProductBuyingPrice() {
        return productBuyingPrice;
    }

    public void setProductBuyingPrice(double productBuyingPrice) {
        this.productBuyingPrice = productBuyingPrice;
    }

    public double getProductSellingPrice() {
        return productSellingPrice;
    }

    public void setProductSellingPrice(double productSellingPrice) {
        this.productSellingPrice = productSellingPrice;
    }

    public String getProductCreatedUser() {
        return productCreatedUser;
    }

    public void setProductCreatedUser(String productCreatedUser) {
        this.productCreatedUser = productCreatedUser;
    }

    public LocalDateTime getProductCreatedDateTime() {
        return productCreatedDateTime;
    }

    public void setProductCreatedDateTime(LocalDateTime productCreatedDateTime) {
        this.productCreatedDateTime = productCreatedDateTime;
    }

    public String getProductModifiedUser() {
        return productModifiedUser;
    }

    public void setProductModifiedUser(String productModifiedUser) {
        this.productModifiedUser = productModifiedUser;
    }

    public LocalDateTime getProductModifiedDateTime() {
        return productModifiedDateTime;
    }

    public void setProductModifiedDateTime(LocalDateTime productModifiedDateTime) {
        this.productModifiedDateTime = productModifiedDateTime;
    }
}
