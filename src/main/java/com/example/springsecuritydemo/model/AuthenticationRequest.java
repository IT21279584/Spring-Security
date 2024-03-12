package com.example.springsecuritydemo.model;

public class AuthenticationRequest {
    private String username;
    private String password;

    // Constructors, getters, and setters

    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    // You can generate these methods automatically in your IDE or write them manually

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
