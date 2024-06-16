package org.example.pjournal.controller;

import org.example.pjournal.model.User;
import org.example.pjournal.dto.UserDTO;
import org.example.pjournal.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class UserController {
    UserService userService;

    @GetMapping("/users")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user")
    public Optional<UserDTO> getUserById(Long Id) {
        return userService.getUserById(Id);
    }

    @PostMapping("/user")
    public UserDTO createUser(
            @RequestBody String userId,
            @RequestBody String password,
            @RequestBody String userName
            ) {
        return userService.createUser(userId, password, userName);
    }

    @DeleteMapping("/user")
    public void deleteUser() {
        // TODO
    }

    @PutMapping("/user")
    public void updateUserData() {
        // TODO
    }
}
