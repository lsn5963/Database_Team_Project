package TeamProject.demo.domain.card.controller;

import TeamProject.demo.domain.card.dto.CardCreate;
import TeamProject.demo.domain.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CardController {
    @Autowired
    CardService cardService;

    @RequestMapping("/cardCreate")
    public String cardCreate(CardCreate cardCreate){
        cardService.save(cardCreate);
        return "ok";
    }

    @RequestMapping("/cardCreate/findAll")
    public String cardFindAll(){
        cardService.findAll();
        return "ok";
    }
    @RequestMapping("/retrieveCardByName")
    public String retrieveCardByName(@RequestBody String name){
        cardService.findAll();
        return "ok";
    }

}
