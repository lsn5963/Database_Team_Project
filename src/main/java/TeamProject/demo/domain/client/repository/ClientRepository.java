package TeamProject.demo.domain.client.repository;

import TeamProject.demo.domain.account.entity.Account;
import TeamProject.demo.domain.client.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByName(String name);
}
