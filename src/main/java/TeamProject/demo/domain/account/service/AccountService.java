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
        Account account = new Account(accountCreate.getType(), accountCreate.getBalance(),accountCreate.getApply(),accountCreate.getOpeningDate(),
                accountCreate.getName(),accountCreate.getPhoneNumber(),accountCreate.getEmail(), accountCreate.getRegNumber());

        accountRepository.save(account);
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public List<Account> findName(String name) {
        List<Account> account = accountRepository.findByName(name);
        for (Account account1 : account) {
            System.out.println(account1.getEmail());
        }

        return account;
    }

    public List<Account> sortDate() {
        List<Account> sortAccount = accountRepository.findAllByOrderByOpeningDate();
        for (Account account : sortAccount) {
            System.out.println("account.getName() = " + account.getName());
        }
        return sortAccount;
    }

    public List<Account> sortNameDate(String name) {
        List<Account> account = accountRepository.findAllByNameOrderByOpeningDate(name);
        for (Account account1 : account) {
            System.out.println(account1.getOpeningDate());
        }
        return account;
    }

    public Account findAccountId(Long accountId) {
        Account account = accountRepository.findById(accountId).get();
        return account;
    }
}
