package TeamProject.demo.domain.card.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

    private String regNumber;

    private Long depositId;

}
