package TeamProject.demo.domain.card.service;

import TeamProject.demo.domain.card.dto.CardCreate;
import TeamProject.demo.domain.card.entity.Card;
import TeamProject.demo.domain.card.repository.CardRepository;
import TeamProject.demo.domain.client.entity.Client;
import TeamProject.demo.domain.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;

    @Autowired
    ClientRepository clientRepository;

    public void save(CardCreate cardCreate){
        System.out.println(cardCreate.getApplyDate());
        Card card = new Card(cardCreate.getApplyDate(),cardCreate.getCardLimit(),
                cardCreate.getPayDate(),cardCreate.getType(), cardCreate.getRegNumber(), cardCreate.getAccount_id());

        cardRepository.save(card);
    }
    public List<Card> findAll(){
        return cardRepository.findAll();
    }

    public List<Card> findName(String name) {
//        cardRepository.findAllByName(name);

        Client client1 = clientRepository.findByName(name);
        String regNumber = client1.getRegNumber();
        List<Card> find = cardRepository.findByRegNumber(regNumber);

        for (Card card : find) {
            System.out.println(card.getId());
        }
        return find;
    }
}
