package TeamProject.demo.domain.history.controller;

import TeamProject.demo.domain.history.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @RequestMapping("/retrieveDetail")
    public String retrieveDetail(@RequestBody Long accountId ){
        historyService.findId(accountId);
        return "ok";
    }

    @RequestMapping("/retrieveDetailByName")
    public String retrieveDetailByName
            (@RequestBody String name, Long accountId ){
        historyService.findNameId(name, accountId);
        return "ok";
    }
}
