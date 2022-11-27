package TeamProject.demo.domain.client.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ClientCreate {
    private String regNumber;

    private String name;

    private String address;

    private LocalDateTime birth;

    private String email;

    private String phoneNumber;

    private String job;
}
