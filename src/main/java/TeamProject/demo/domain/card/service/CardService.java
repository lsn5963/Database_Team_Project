package TeamProject.demo.domain.card.service;

import TeamProject.demo.domain.card.dto.CardCreate;
import TeamProject.demo.domain.card.entity.Card;
import TeamProject.demo.domain.card.repository.CardRepository;
import TeamProject.demo.domain.client.entity.Client;
import TeamProject.demo.domain.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;

    @Autowired
    ClientRepository clientRepository;

    public void save(CardCreate cardCreate){
        System.out.println(cardCreate.getApplyDate());
        Card card = new Card(cardCreate.getApplyDate(),cardCreate.getCardLimit(),
                cardCreate.getPayDate(),cardCreate.getType());

        cardRepository.save(card);
    }
    public List<Card> findAll(){
        return cardRepository.findAll();
    }

    public void findName(String name) {
//        cardRepository.findAllByName(name);

        Client client = clientRepository.findByName(name);
        List<Card> cardList = client.getCardList();
        for (Card card : cardList) {
            System.out.println(card.getType());
        }

//        System.out.println(client.get주민번호());

//        c
    }
}
