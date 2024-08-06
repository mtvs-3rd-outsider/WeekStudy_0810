package com.outsider.weekstudy_0810.embeded;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Column;

@Embeddable
public class User {
    @Column(name = "USERNAME", nullable = false)
    private String username;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    protected User() {}

    public User(String username, String email) {
        validateUsername(username);
        validateEmail(email);
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        validateUsername(username);
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        validateEmail(email);
        this.email = email;
    }

    private void validateUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        if (username.length() < 3 || username.length() > 20) {
            throw new IllegalArgumentException("Username must be between 3 and 20 characters long");
        }
    }

    private void validateEmail(String email) {
        if (email == null || email.trim().isEmpty() || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Email must be a valid email address");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
