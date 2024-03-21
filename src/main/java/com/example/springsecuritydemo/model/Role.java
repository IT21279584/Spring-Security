package com.example.springsecuritydemo.model;

public enum Role {
    ADMIN("ADMIN"),
    TEACHER("TEACHER"),
    STUDENT("STUDENT"),
    USER("USER");

    private final String roleName;

    Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
