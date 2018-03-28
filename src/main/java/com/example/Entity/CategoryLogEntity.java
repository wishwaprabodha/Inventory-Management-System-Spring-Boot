package com.example.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "category_log", schema = "ipay")
public class CategoryLogEntity {
    private int categoryId;
    private String categoryName;
    private String categoryCreatedUser;
    private Timestamp categoryCreatedDateTime;
    private String categoryModifiedUser;
    private Timestamp categoryModifiedDateTime;

    @Id
    @Column(name = "categoryId")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "categoryName")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
    @Column(name = "categoryCreatedUser")
    public String getCategoryCreatedUser() {
        return categoryCreatedUser;
    }

    public void setCategoryCreatedUser(String categoryCreatedUser) {
        this.categoryCreatedUser = categoryCreatedUser;
    }

    @Basic
    @Column(name = "categoryCreatedDateTime")
    public Timestamp getCategoryCreatedDateTime() {
        return categoryCreatedDateTime;
    }

    public void setCategoryCreatedDateTime(Timestamp categoryCreatedDateTime) {
        this.categoryCreatedDateTime = categoryCreatedDateTime;
    }

    @Basic
    @Column(name = "categoryModifiedUser")
    public String getCategoryModifiedUser() {
        return categoryModifiedUser;
    }

    public void setCategoryModifiedUser(String categoryModifiedUser) {
        this.categoryModifiedUser = categoryModifiedUser;
    }

    @Basic
    @Column(name = "categoryModifiedDateTime")
    public Timestamp getCategoryModifiedDateTime() {
        return categoryModifiedDateTime;
    }

    public void setCategoryModifiedDateTime(Timestamp categoryModifiedDateTime) {
        this.categoryModifiedDateTime = categoryModifiedDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryLogEntity that = (CategoryLogEntity) o;
        return categoryId == that.categoryId &&
                Objects.equals(categoryName, that.categoryName) &&
                Objects.equals(categoryCreatedUser, that.categoryCreatedUser) &&
                Objects.equals(categoryCreatedDateTime, that.categoryCreatedDateTime) &&
                Objects.equals(categoryModifiedUser, that.categoryModifiedUser) &&
                Objects.equals(categoryModifiedDateTime, that.categoryModifiedDateTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(categoryId, categoryName, categoryCreatedUser, categoryCreatedDateTime, categoryModifiedUser, categoryModifiedDateTime);
    }
}
