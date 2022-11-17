package TeamProject.demo.domain.history.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class History {

    @Id
    @GeneratedValue
    private Long id;

    private Long accountId;

    private LocalDateTime dawDate;  //입출금날짜

    private Long transactionNumber;

    private String depositType;

    private String depositContents;

    private Long amount;

    private Long balance;
}
