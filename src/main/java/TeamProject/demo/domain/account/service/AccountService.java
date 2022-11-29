package TeamProject.demo.domain.account.service;

import TeamProject.demo.domain.account.dto.AccountCreate;
import TeamProject.demo.domain.account.entity.Account;
import TeamProject.demo.domain.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
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
        List<Account> account = accountRepository.findByName(name);
        for (Account account1 : account) {
            System.out.println(account1.getEmail());
        }
    }

    public void sortDate() {
        List<Account> sortAccount = accountRepository.findAllByOrderByOpeningDate();
        for (Account account : sortAccount) {
            System.out.println("account.getName() = " + account.getName());
        }
    }

    public void sortNameDate(String name) {
        List<Account> account = accountRepository.findAllByNameOrderByOpeningDate(name);
        for (Account account1 : account) {
            System.out.println(account1.getOpeningDate());
        }
    }

    public void findAccountId(Long accountId) {
        accountRepository.findById(accountId);
    }
}
