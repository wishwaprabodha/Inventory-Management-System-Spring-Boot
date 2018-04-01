package com.example.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "role_permission", schema = "ipaytest2", catalog = "")
public class RolePermissionEntity {
    private int refId;
    private int roleRoleId;
    private int permissionPermissionId;

    @Id
    @Column(name = "refId")
    public int getRefId() {
        return refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }

    @Basic
    @Column(name = "role_roleId")
    public int getRoleRoleId() {
        return roleRoleId;
    }

    public void setRoleRoleId(int roleRoleId) {
        this.roleRoleId = roleRoleId;
    }

    @Basic
    @Column(name = "permission_permissionId")
    public int getPermissionPermissionId() {
        return permissionPermissionId;
    }

    public void setPermissionPermissionId(int permissionPermissionId) {
        this.permissionPermissionId = permissionPermissionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolePermissionEntity that = (RolePermissionEntity) o;
        return refId == that.refId &&
                roleRoleId == that.roleRoleId &&
                permissionPermissionId == that.permissionPermissionId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(refId, roleRoleId, permissionPermissionId);
    }
}
