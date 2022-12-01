package TeamProject.demo.domain.card.controller;

import TeamProject.demo.domain.card.dto.CardCreate;
import TeamProject.demo.domain.card.entity.Card;
import TeamProject.demo.domain.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CardController {
    @Autowired
    CardService cardService;

    @RequestMapping("/createCard")
    public ResponseEntity  createCard(@RequestBody  CardCreate cardCreate){
        cardService.save(cardCreate);
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }

    @RequestMapping("/retrieveAllCard")
    public ResponseEntity retrieveAllCard(){
        List<Card> all = cardService.findAll();
        System.out.println("cardService.findAll() = " + cardService.findAll());
        return ResponseEntity.status(HttpStatus.CREATED).body(all);
    }
    @RequestMapping("/retrieveCardByName/{name}")
    public ResponseEntity retrieveCardByName(@PathVariable String name){
//        System.out.println(name);
        System.out.println("name = " + name);
        List<Card> name1 = cardService.findName(name);
        return ResponseEntity.status(HttpStatus.CREATED).body(name1);
    }

}
