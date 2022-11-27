package TeamProject.demo.domain.account.service;

import TeamProject.demo.domain.account.dto.AccountCreate;
import TeamProject.demo.domain.account.entity.Account;
import TeamProject.demo.domain.account.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    AccountRepository accountRepository;
    public void save(AccountCreate accountCreate) {
        Account account = new Account(accountCreate.getType(),accountCreate.getApply(),accountCreate.getOpeningDate(),
                accountCreate.getName(),accountCreate.getPhoneNumber(),accountCreate.getEmail());

        accountRepository.save(account);
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public void findName(String name) {
//        return accountRepository.
    }

    public void sortDate(String date) {
    }

    public void sortNameDate(String name, String date) {
    }
}
