package TeamProject.demo.domain.account.controller;

import TeamProject.demo.domain.account.dto.AccountCreate;
import TeamProject.demo.domain.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller


public class AccountController {
    @Autowired
    AccountService accountService;
    @RequestMapping("/retrieveAccountByID/{id}")
    public ResponseEntity retrieveAccountByID(@PathVariable Long id){
        accountService.findAccountId(id);
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }
    @RequestMapping("/createAccount")
    public ResponseEntity createAccount(@RequestBody AccountCreate accountCreate){
        accountService.save(accountCreate);
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }
    @RequestMapping("/retrieveAllAccount")
    public ResponseEntity retrieveAllAccount(){
        accountService.findAll();
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }
    @RequestMapping("/retrieveAccountByName/{name}")
    public ResponseEntity retrieveAccountByName(@PathVariable String name){
        accountService.findName(name);
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }
    @RequestMapping("/sortAccountByDate")
    public ResponseEntity sortAccountByDate(){
        accountService.sortDate();
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }
    @RequestMapping("/sortAccountByNameAndDate/{name}")
    public ResponseEntity sortAccountByNameAndDate(@PathVariable String name){
        accountService.sortNameDate(name);
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }
}
