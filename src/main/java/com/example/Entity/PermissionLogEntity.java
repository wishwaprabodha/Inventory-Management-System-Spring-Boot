package com.example.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "permission_log", schema = "ipaytest2", catalog = "")
public class PermissionLogEntity {
    private int permissionId;
    private String permissionName;

    @Id
    @Column(name = "permissionId")
    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    @Basic
    @Column(name = "permissionName")
    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PermissionLogEntity that = (PermissionLogEntity) o;
        return permissionId == that.permissionId &&
                Objects.equals(permissionName, that.permissionName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(permissionId, permissionName);
    }
}
