package TeamProject.demo.domain.card.entity;

import TeamProject.demo.domain.account.entity.Account;
import TeamProject.demo.domain.client.entity.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long cardId;

    private LocalDateTime applyDate;

    private Long cardLimit;

    private LocalDateTime payDate;

    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    private Account account;



}
