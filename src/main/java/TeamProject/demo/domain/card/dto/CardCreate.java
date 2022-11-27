package TeamProject.demo.domain.card.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CardCreate {

    private LocalDateTime applyDate;

    private Long cardLimit;

    private LocalDateTime payDate;

    private String type;

    private String regNumber;
}
