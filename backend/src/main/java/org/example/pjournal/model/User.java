package org.example.pjournal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Builder;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false)
    private Long id;

    @Column(name="userId", nullable = false)
    private String userId;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="userName", nullable = false)
    private String userName;

    @Builder
    public User(String userId, String password, String userName) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;
    }

    protected User() {
        // Basic constructor
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
