package org.launchcode.techjobsauth.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginFormDTO {

    @NotNull
    @NotBlank
    @Size(min = 3, max = 20, message = "Invalid username, must be between 3 and 20 characters")
    private String username;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 30, message = "Invalid username, must be between 5 and 30 characters")
    private String password;

    public @NotNull @NotBlank @Size(min = 3, max = 20, message = "Invalid username, must be between 3 and 20 characters") String getUsername() {
        return username;
    }

    public void setUsername(@NotNull @NotBlank @Size(min = 3, max = 20, message = "Invalid username, must be between 3 and 20 characters") String username) {
        this.username = username;
    }

    public @NotNull @NotBlank @Size(min = 5, max = 30, message = "Invalid username, must be between 5 and 30 characters") String getPassword() {
        return password;
    }

    public void setPassword(@NotNull @NotBlank @Size(min = 5, max = 30, message = "Invalid username, must be between 5 and 30 characters") String password) {
        this.password = password;
    }
}
