package TeamProject.demo.domain.card.entity;

import TeamProject.demo.domain.account.entity.Account;
import TeamProject.demo.domain.client.entity.Client;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_Id")
    private Long id;

//    @NotNull
//    @Column(unique = true)
//    private Long cardId;

    @NotNull
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime applyDate;

    @NotNull
    private Long cardLimit;

    @NotNull
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss", timezone = "Asia/Seoul")
    private LocalDateTime payDate;

    @NotNull
    private String type;

    @NotNull
    private String regNumber;
    private Long account_Id;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "regNumber")
//    private Client client;

//    @NotNull
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Account account;

    public Card(LocalDateTime applyDate, Long cardLimit, LocalDateTime payDate, String type) {
        this.applyDate = applyDate;
        this.cardLimit = cardLimit;
        this.payDate = payDate;
        this.type = type;
    }
    public Card(){

    }
//    public static Long getCards(Long id){
//        client.
//        return client;
//    }
}
