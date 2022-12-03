package TeamProject.demo.domain.account.entity;

import TeamProject.demo.domain.client.entity.Client;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.yaml.snakeyaml.tokens.FlowEntryToken;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String type;

    @NotNull
    private Long balance;

    @NotNull
    private Boolean apply;

    @NotNull
    private LocalDateTime openingDate;

    @NotNull
    private String name;

    @NotNull
    private String phoneNumber;

    private String email;

    private String regNumber;
    public Account(String type, Long balance, Boolean apply, LocalDateTime openingDate, String name, String phoneNumber, String email, String regNumber) {
        this.type = type;
        this.balance = balance;
        this.apply = apply;
        this.openingDate = openingDate;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.regNumber = regNumber;
    }
    public  Account(){

    }
}
