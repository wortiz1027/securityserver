package co.com.securityserver.repository.dao;

import co.com.securityserver.domain.OauthClientDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OAuthClientDAO extends JpaRepository<OauthClientDetails, Integer> {

    boolean isClientAvailable(String clientId);
    OauthClientDetails loadClientById(String clientId);

}