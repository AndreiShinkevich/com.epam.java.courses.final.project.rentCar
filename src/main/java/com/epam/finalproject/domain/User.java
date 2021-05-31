package com.epam.finalproject.domain;


import com.epam.finalproject.enums.UserRole;

public class User {

    private Integer id;

    private String login;
    private String password;
    private String firstName;
    private String email;

    private UserRole role;

    public User(Integer id, String login, String password, String firstName, String email, UserRole role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.email = email;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
