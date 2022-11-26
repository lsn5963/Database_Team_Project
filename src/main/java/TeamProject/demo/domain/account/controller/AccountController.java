package TeamProject.demo.domain.account.controller;

import TeamProject.demo.domain.account.dto.AccountCreate;
import TeamProject.demo.domain.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("/createAccount")
    public void createAccount(AccountCreate accountCreate){
        accountService.save(accountCreate);
    }
}
