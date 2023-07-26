package com.ead.authuser.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    public interface UserView {
        public static interface RegistrationPost {}
        public static interface UserPut {}
        public static interface PasswordPut {}
        public static interface ImagePut {}
    }

    private UUID userId;

    @NotBlank(groups = {UserView.RegistrationPost.class, UserView.UserPut.class})
    @JsonView({UserView.RegistrationPost.class, UserView.UserPut.class,})
    @Size(min = 3, max = 50)
    private String userName;

    @NotBlank(groups = UserView.RegistrationPost.class)
    @Email
    @JsonView(UserView.RegistrationPost.class)
    @Size(min = 5, max = 50)
    private String email;

    @NotBlank(groups = { UserView.RegistrationPost.class, UserView.PasswordPut.class })
    @JsonView({UserView.RegistrationPost.class, UserView.PasswordPut.class})
    @Size(min = 5, max = 20)
    private String password;

    @NotBlank(groups = UserView.PasswordPut.class)
    @JsonView(UserView.PasswordPut.class)
    @Size(min = 5, max = 20)
    private String OldPassword;

    @NotBlank(groups = {UserView.RegistrationPost.class, UserView.UserPut.class})
    @JsonView({UserView.RegistrationPost.class, UserView.UserPut.class})
    @Size(min = 5, max = 50)
    private String fullName;

    @JsonView({UserView.RegistrationPost.class, UserView.UserPut.class})
    @Size(min = 5, max = 30)
    private String phoneNumber;


    @NotBlank
    @JsonView({UserView.RegistrationPost.class, UserView.UserPut.class})
    @Size(min = 5, max = 30)
    private String cpf;

    @NotBlank(groups = UserView.ImagePut.class)
    @JsonView(UserView.ImagePut.class)
    @Size(min = 5, max = 50)
    private String imageUrl;
}
