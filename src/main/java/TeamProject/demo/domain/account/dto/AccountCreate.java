package TeamProject.demo.domain.account.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class AccountCreate {

    private String type;

    private Boolean apply;

    private LocalDateTime openingDate;

    private String name;

    private String phoneNumber;

    private String email;

    private String regNumber;
}
