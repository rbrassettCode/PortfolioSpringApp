package com.main.portfoliospringapp.ressource;

import com.main.portfoliospringapp.model.Account;

public class RegisterAccountResource {
    private String identifier;
    private String username;
    private String firstName;
    private String lastName;
    private String email;



    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account toModel() {
        return new Account(this.identifier, this.username, this.firstName, this.lastName, this.email);
    }
}
