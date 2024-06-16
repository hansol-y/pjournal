package org.example.pjournal.service;


import org.example.pjournal.model.User;
import org.example.pjournal.dto.UserDTO;
import org.example.pjournal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserDTO> dtos = new ArrayList<>();
        for (User user : users) {
            dtos.add(convertToDto(user));
        }
        return dtos;
    }

    public Optional<UserDTO> getUserById(Long Id) {
        Optional<User> user = userRepository.findById(Id);
        // TODO
        return null;
    }

    public UserDTO createUser(String userId, String password, String userName) {
        User entity = new User(userId, password, userName);
        return convertToDto(userRepository.save(entity));
    }

    private UserDTO convertToDto(User user) {
        return new UserDTO(user.getUserId(), user.getUserName());
    }
}
