package TeamProject.demo.domain.history.entity;

import TeamProject.demo.domain.account.entity.Account;
import com.sun.istack.NotNull;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class History {

    @Id
    @GeneratedValue
    private Long id;

//    @NotNull
//    @Column(unique = true)
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "account_Id")
//    private Account account;
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
