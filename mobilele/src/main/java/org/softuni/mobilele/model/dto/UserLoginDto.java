package org.softuni.mobilele.model.dto;

public class UserLoginDto {

    private String email;

    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserLoginDto{" +
                "username='" + email + '\'' +
                //за да не се вижда паролата
                ", password='" + (password != null ? "[PROVIDED]" : null) + '\'' +
                '}';
    }
}
