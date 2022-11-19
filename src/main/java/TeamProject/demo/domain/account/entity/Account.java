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
    private String accountId;

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

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;
}
