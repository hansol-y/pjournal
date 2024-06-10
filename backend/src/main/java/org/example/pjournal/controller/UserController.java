package org.example.pjournal.controller;

import org.example.pjournal.model.User;
import org.example.pjournal.service.UserService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

public class UserController {
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user")
    public Optional<User> getUserById(Long Id) {
        return userService.getUserById(Id);
    }

    @PostMapping("/user")
    public User createUser() {
        // TODO
        return null;
    }

    @DeleteMapping("/user")
    public void deleteUser() {
        // TODO
    }

    @PutMapping("/user/")
    public void updateUserData() {
        // TODO
    }
}
