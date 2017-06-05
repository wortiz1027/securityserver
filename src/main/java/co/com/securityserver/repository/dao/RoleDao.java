package co.com.securityserver.repository.dao;

import co.com.securityserver.domain.TblSecRoles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleDao extends JpaRepository<TblSecRoles, Integer>{

    List<TblSecRoles> getRoleListNq();

}