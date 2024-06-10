package org.example.pjournal.service;


import org.example.pjournal.model.User;
import org.example.pjournal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long Id) {
        return userRepository.findById(Id);
    }
}
