package co.com.securityserver.domain;

import javax.persistence.*;

/**
 * Created by Wilman Ortiz Navarro on 4/06/2017.
 */
@Entity
@Table(name = "tbl_sec_roles", schema = "security", catalog = "")
public class TblSecRoles {
    private Integer idRole;
    private String role;

    @Id
    @Column(name = "id_role")
    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    @Basic
    @Column(name = "role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TblSecRoles that = (TblSecRoles) o;

        if (idRole != null ? !idRole.equals(that.idRole) : that.idRole != null) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRole != null ? idRole.hashCode() : 0;
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
