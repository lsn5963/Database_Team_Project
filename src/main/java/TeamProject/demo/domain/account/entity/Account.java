package TeamProject.demo.domain.account.entity;

import TeamProject.demo.domain.client.entity.Client;
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

    private String accountId;

    private String type;

    private Long balance;

    private Boolean apply;

    private LocalDateTime openingDate;

    private String name;

    private String phoneNumber;

    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;
}
