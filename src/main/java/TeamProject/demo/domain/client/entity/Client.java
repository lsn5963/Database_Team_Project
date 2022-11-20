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
@Setter
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
}
