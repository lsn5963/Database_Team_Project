package TeamProject.demo.domain.client.entity;

import TeamProject.demo.domain.card.entity.Card;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
public class Client {

    @Id
    @GeneratedValue
    @Column(name = "client_id")
    private Long id;


    @NotNull
    @Column(unique = true)
    private String regNumber;

    @NotNull
    private String name;

    @NotNull
    private String address;

    @NotNull
    private LocalDate birth;

    private String email;

    @NotNull
    private String phoneNumber;

    private String job;

//    @OneToMany(mappedBy = "client")
//    private List<Card> cardList;

//    public Client(String regNumber, String name, String address, LocalDateTime birth, String email, String phoneNumber, String job){
//
//    }

    public Client(String regNumber, String name, String address, LocalDate birth, String email, String phoneNumber, String job) {
        this.regNumber = regNumber;
        this.name = name;
        this.address = address;
        this.birth = birth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.job = job;
    }

    public Client(){

    }

//
}
