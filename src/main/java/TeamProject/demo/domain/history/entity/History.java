package TeamProject.demo.domain.history.entity;

import com.sun.istack.NotNull;
import lombok.Getter;

import javax.persistence.Column;
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

    @NotNull
    @Column(unique = true)
    private Long accountId;

    @NotNull
    private LocalDateTime dawDate;  //입출금날짜

    @NotNull
    private Long transactionNumber;

    @NotNull
    private String depositType;

    @NotNull
    private String depositContents;

    @NotNull
    private Long amount;

    @NotNull
    private Long balance;
}
