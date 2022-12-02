package TeamProject.demo.domain.history.controller;

import TeamProject.demo.domain.history.entity.History;
import TeamProject.demo.domain.history.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @RequestMapping("/retrieveDetail/{accountId}")
    public ResponseEntity retrieveDetail(@PathVariable Long accountId ){
        List<History> id = historyService.findId(accountId);
        return ResponseEntity.status(HttpStatus.CREATED).body(id);
    }

    @RequestMapping("/retrieveDetailByName")
    public ResponseEntity retrieveDetailByName(@PathVariable String name, Long accountId ){
        History nameId = historyService.findNameId(name, accountId);
        return ResponseEntity.status(HttpStatus.CREATED).body(nameId);
    }
    @RequestMapping("/retrieveAllDetail")
    public ResponseEntity retrieveAllDetail(){
        List<History> findAll = historyService.findAll();
        return ResponseEntity.status(HttpStatus.CREATED).body(findAll);
    }
}
