package com.ead.authuser.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {
    private UUID userId;
    private String userName;
    private String email;
    private String password;
    private String OldPassword;
    private String fullName;
    private String phoneNumber;
    private String cpf;
    private String imageUrl;
}
