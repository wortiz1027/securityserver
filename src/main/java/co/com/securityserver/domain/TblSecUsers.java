package co.com.securityserver.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbl_sec_users", schema = "security")
public class TblSecUsers implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @Column(name = "ID_USER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal idUser;

    @Basic(optional = false)
    @NotNull
    @Column(name = "CEDULA")
    private BigInteger cedula;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRES")
    private String nombre;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "APELLIDOS")
    private String apellido;

    @Size(max = 100)
    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;

    @Size(max = 30)
    @Column(name = "TELEFONO")
    private String telefono;

    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "EMAIL")
    private String email;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "LOGIN")
    private String login;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "PASSWORD")
    private String password;

    @Size(max = 10)
    @Column(name = "ENABLE")
    private String enable;

    @Size(max = 10)
    @Column(name = "ACCOUNT_NON_EXPIRED")
    private String accountNonExpired;

    @Size(max = 10)
    @Column(name = "CREDENTIAL_NON_EXPIRED")
    private String credentialNonExpired;

    @Size(max = 10)
    @Column(name = "ACCOUNT_NON_LOCKET")
    private String accountNonLocket;

    @ManyToMany(mappedBy = "userList", fetch = FetchType.LAZY)
    private List<TblSecRoles> roleList;

    public TblSecUsers() {
    }

    public TblSecUsers(BigDecimal idUser) {
        this.idUser = idUser;
    }

    public TblSecUsers(BigDecimal idUser, BigInteger cedula, String nombre, String apellido, String email, String login, String password) {
        this.idUser = idUser;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public BigDecimal getIdUser() {
        return idUser;
    }

    public void setIdUser(BigDecimal idUser) {
        this.idUser = idUser;
    }

    public BigInteger getCedula() {
        return cedula;
    }

    public void setCedula(BigInteger cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(String accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public String getCredentialNonExpired() {
        return credentialNonExpired;
    }

    public void setCredentialNonExpired(String credentialNonExpired) {
        this.credentialNonExpired = credentialNonExpired;
    }

    public String getAccountNonLocket() {
        return accountNonLocket;
    }

    public void setAccountNonLocket(String accountNonLocked) {
        this.accountNonLocket = accountNonLocked;
    }

    public List<TblSecRoles> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<TblSecRoles> roleList) {
        this.roleList = roleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof TblSecUsers)) {
            return false;
        }
        TblSecUsers other = (TblSecUsers) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.User[ idUser=" + idUser + " ]";
    }

}
