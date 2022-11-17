package TeamProject.demo.domain.account.repository;

import TeamProject.demo.domain.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
