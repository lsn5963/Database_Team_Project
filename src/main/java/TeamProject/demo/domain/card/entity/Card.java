package TeamProject.demo.domain.card.entity;

import TeamProject.demo.domain.account.entity.Account;
import TeamProject.demo.domain.client.entity.Client;
import com.sun.istack.NotNull;
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

    @NotNull
    @Column(unique = true)
    private Long cardId;

    @NotNull
    private LocalDateTime applyDate;

    @NotNull
    private Long cardLimit;

    @NotNull
    private LocalDateTime payDate;

    @NotNull
    private String type;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    private Account account;

    public Card(LocalDateTime applyDate, Long cardLimit, LocalDateTime payDate, String type) {
        this.applyDate = applyDate;
        this.cardLimit = cardLimit;
        this.payDate = payDate;
        this.type = type;
    }
}
