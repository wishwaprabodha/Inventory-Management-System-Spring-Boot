package com.example.Entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "permission", schema = "ipaytest2")
public class PermissionEntity {
    private int permissionId;
    private String permissionName;
    private Collection<RolePermissionEntity> rolePermissionsByPermissionId;

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
        PermissionEntity that = (PermissionEntity) o;
        return permissionId == that.permissionId &&
                Objects.equals(permissionName, that.permissionName);
    }




    @Override
    public int hashCode() {

        return Objects.hash(permissionId, permissionName);
    }

    @OneToMany(mappedBy = "permissionByPermissionPermissionId")
    public Collection<RolePermissionEntity> getRolePermissionsByPermissionId() {
        return rolePermissionsByPermissionId;
    }

    public void setRolePermissionsByPermissionId(Collection<RolePermissionEntity> rolePermissionsByPermissionId) {
        this.rolePermissionsByPermissionId = rolePermissionsByPermissionId;
    }
}
