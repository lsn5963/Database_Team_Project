package TeamProject.demo.domain.history.controller;

import TeamProject.demo.domain.history.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @RequestMapping("/retrieveDetail/{accountId}")
    public ResponseEntity retrieveDetail(@PathVariable Long accountId ){
        historyService.findId(accountId);
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }

    @RequestMapping("/retrieveDetailByName")
    public ResponseEntity retrieveDetailByName
            (@PathVariable String name, Long accountId ){
        historyService.findNameId(name, accountId);
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }
}
