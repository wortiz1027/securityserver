package co.com.securityserver.repository.dao;

import co.com.securityserver.domain.TblSecUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<TblSecUsers, Integer> {

    boolean isUserAvailable(String login);
    TblSecUsers loadUserByName(String username);

}