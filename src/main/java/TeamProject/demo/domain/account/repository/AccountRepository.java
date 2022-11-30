package TeamProject.demo.domain.account.repository;

import TeamProject.demo.domain.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
//    Account findByAccountId(Long accountId);
    List<Account> findByName(String name);
    List<Account> findAllByOrderByOpeningDate();
    List<Account> findAllByNameOrderByOpeningDate(String name);

}
