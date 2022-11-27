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
    @RequestMapping("/retrieveAllAccount")
    public void retrieveAllAccount(){
        accountService.findAll();
    }
    @RequestMapping("/retrieveAccountByName")
    public void retrieveAccountByName(String name){
        accountService.findName(name);
    }
    @RequestMapping("/sortAccountByDate")
    public void sortAccountByDate(String date){
        accountService.sortDate(date);
    }
    @RequestMapping("/sortAccountByNameAndDate")
    public void sortAccountByNameAndDate(String name, String date){
        accountService.sortNameDate(name, date);
    }
}
