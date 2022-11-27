package TeamProject.demo.domain.card.service;

import TeamProject.demo.domain.card.dto.CardCreate;
import TeamProject.demo.domain.card.entity.Card;
import TeamProject.demo.domain.card.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;

    public void save(CardCreate cardCreate){
        Card card = new Card(cardCreate.getApplyDate(),cardCreate.getCardLimit(),
                cardCreate.getPayDate(),cardCreate.getType());

        cardRepository.save(card);
    }
    public void findAll(){
        cardRepository.findAll();
    }
}
