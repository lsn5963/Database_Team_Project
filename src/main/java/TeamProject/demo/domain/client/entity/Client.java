package TeamProject.demo.domain.client.entity;

import lombok.Getter;
import lombok.Setter;

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

    private String regNumber;

    private String name;

    private String address;

    private LocalDateTime birth;

    private String email;

    private String job;
}