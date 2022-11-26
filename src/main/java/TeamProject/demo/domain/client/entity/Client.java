package TeamProject.demo.domain.client.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
public class Client {

    @Id
    @GeneratedValue
    private Long id;


    @NotNull
    @Column(unique = true)
    private String regNumber;

    @NotNull
    private String name;

    @NotNull
    private String address;

    @NotNull
    private LocalDateTime birth;

    private String email;

    @NotNull
    private String phoneNumber;

    private String job;

//    public Client(String regNumber, String name, String address, LocalDateTime birth, String email, String phoneNumber, String job){
//
//    }

    public Client(String regNumber, String name, String address, LocalDateTime birth, String email, String phoneNumber, String job) {
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
}
