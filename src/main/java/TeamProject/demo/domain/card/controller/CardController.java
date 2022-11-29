package TeamProject.demo.domain.card.controller;

import TeamProject.demo.domain.card.dto.CardCreate;
import TeamProject.demo.domain.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CardController {
    @Autowired
    CardService cardService;

    @RequestMapping("/cardCreate")
    public ResponseEntity  cardCreate(@RequestBody  CardCreate cardCreate){
        cardService.save(cardCreate);
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }

    @RequestMapping("/cardCreate/findAll")
    public ResponseEntity cardFindAll(){
        cardService.findAll();
        System.out.println("cardService.findAll() = " + cardService.findAll());
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }
    @RequestMapping("/retrieveCardByName")
    public ResponseEntity retrieveCardByName(@RequestBody String name){
        cardService.findAll();
        return ResponseEntity.status(HttpStatus.CREATED).body("zz");
    }

}
