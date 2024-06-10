package com.example.pjournal.models;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private Long id;
    private String userId;
    private String name;
    private String password;

    public User(String userId, String name, String password) {
        
        this.userId = userId;
        this.name = name;
        this.password = password;
    }
}