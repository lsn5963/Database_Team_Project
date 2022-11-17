package TeamProject.demo.domain.account.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    private String accountId;

    private String type;

    private Long balance;

    private Boolean apply;

    private LocalDateTime openingDate;

    private String name;

    private String phoneNumber;

    private String email;

    private String regNumber;
}
