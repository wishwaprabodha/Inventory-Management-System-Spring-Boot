package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */

@Entity
@NamedQuery(name = "Category.add", query = "SELECT c FROM Category c")
public class Category implements Serializable {

    @Id
    private int categoryId;
    private String categoryName;
    private String categoryCreatedUser;
    private LocalDateTime categoryCreatedDateTime;
    private String categoryModifiedUser;
    private LocalDateTime categoryModifiedDateTime;

    @OneToMany(mappedBy="category")
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Category(){

    }

    public Category(int categoryId, String categoryName, String categoryCreatedUser, LocalDateTime categoryCreatedDateTime,
                    String categoryModifiedUser, LocalDateTime categoryModifiedDateTime) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryCreatedUser = categoryCreatedUser;
        this.categoryCreatedDateTime = categoryCreatedDateTime;
        this.categoryModifiedUser = categoryModifiedUser;
        this.categoryModifiedDateTime = categoryModifiedDateTime;
    }



    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCreatedUser() {
        return categoryCreatedUser;
    }

    public void setCategoryCreatedUser(String categoryCreatedUser) {
        this.categoryCreatedUser = categoryCreatedUser;
    }

    public LocalDateTime getCategoryCreatedDateTime() {
        return categoryCreatedDateTime;
    }

    public void setCategoryCreatedDateTime(LocalDateTime categoryCreatedDateTime) {
        this.categoryCreatedDateTime = categoryCreatedDateTime;
    }

    public String getCategoryModifiedUser() {
        return categoryModifiedUser;
    }

    public void setCategoryModifiedUser(String categoryModifiedUser) {
        this.categoryModifiedUser = categoryModifiedUser;
    }

    public LocalDateTime getCategoryModifiedDateTime() {
        return categoryModifiedDateTime;
    }

    public void setCategoryModifiedDateTime(LocalDateTime categoryModifiedDateTime) {
        this.categoryModifiedDateTime = categoryModifiedDateTime;
    }
}

