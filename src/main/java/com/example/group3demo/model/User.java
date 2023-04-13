package com.example.group3demo.model;

import java.time.LocalDateTime;

public class User {

    private String username;
    private LocalDateTime localDateTime;

    public User() {}

    public User(String username, LocalDateTime localDateTime) {
        this.username = username;
        this.localDateTime = localDateTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
