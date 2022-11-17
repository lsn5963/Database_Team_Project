package TeamProject.demo.domain.client.repository;

import TeamProject.demo.domain.account.entity.Account;
import TeamProject.demo.domain.client.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
