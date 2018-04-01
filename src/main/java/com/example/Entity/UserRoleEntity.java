package com.example.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_role", schema = "ipaytest2", catalog = "")
public class UserRoleEntity {
    private int refId;
    private int userUserId;
    private int roleRoleId;

    @Id
    @Column(name = "refId")
    public int getRefId() {
        return refId;
    }

    public void setRefId(int refId) {
        this.refId = refId;
    }

    @Basic
    @Column(name = "user_userId")
    public int getUserUserId() {
        return userUserId;
    }

    public void setUserUserId(int userUserId) {
        this.userUserId = userUserId;
    }

    @Basic
    @Column(name = "role_roleId")
    public int getRoleRoleId() {
        return roleRoleId;
    }

    public void setRoleRoleId(int roleRoleId) {
        this.roleRoleId = roleRoleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRoleEntity that = (UserRoleEntity) o;
        return refId == that.refId &&
                userUserId == that.userUserId &&
                roleRoleId == that.roleRoleId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(refId, userUserId, roleRoleId);
    }
}
