package TeamProject.demo.domain.account.service;

import TeamProject.demo.domain.account.dto.AccountCreate;
import TeamProject.demo.domain.account.entity.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public void save(AccountCreate accountCreate) {
        Account account = new Account(accountCreate.getType(),accountCreate.getApply(),accountCreate.getOpeningDate(),
                accountCreate.getName(),accountCreate.getPhoneNumber(),accountCreate.getEmail());
    }
}
