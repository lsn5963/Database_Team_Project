package TeamProject.demo.domain.account.controller;

import TeamProject.demo.domain.account.dto.AccountCreate;
import TeamProject.demo.domain.account.entity.Account;
import TeamProject.demo.domain.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller


public class AccountController {
    @Autowired
    AccountService accountService;
    @RequestMapping("/retrieveAccountByID/{id}")
    public ResponseEntity retrieveAccountByID(@PathVariable Long id){
        Account accountId = accountService.findAccountId(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(accountId);
    }
    @RequestMapping("/createAccount")
    public ResponseEntity createAccount(@RequestBody AccountCreate accountCreate){
        accountService.save(accountCreate);
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }
    @RequestMapping("/retrieveAllAccount")
    public ResponseEntity retrieveAllAccount(){
        List<Account> all = accountService.findAll();
        return ResponseEntity.status(HttpStatus.CREATED).body(all);
    }
    @RequestMapping("/retrieveAccountByName/{name}")
    public ResponseEntity retrieveAccountByName(@PathVariable String name){
        List<Account> name1 = accountService.findName(name);
        return ResponseEntity.status(HttpStatus.CREATED).body(name1);
    }
    @RequestMapping("/sortAccountByDate")
    public ResponseEntity sortAccountByDate(){
        List<Account> accounts = accountService.sortDate();
        return ResponseEntity.status(HttpStatus.CREATED).body(accounts);
    }
    @RequestMapping("/sortAccountByNameAndDate/{name}")
    public ResponseEntity sortAccountByNameAndDate(@PathVariable String name){
        List<Account> accounts = accountService.sortNameDate(name);
        return ResponseEntity.status(HttpStatus.CREATED).body(accounts);
    }
}
