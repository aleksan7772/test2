package com.example.test2.service;

import com.example.test2.model.User;
import com.example.test2.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserEmeil(String emeil) {
        return userRepository.findByEmail(emeil);
    }

    public User saveNewUser(String emeil, String password, String adress) {
        User newUser = new User();
        newUser.setEmail(emeil);
        newUser.setPassword(password);
        newUser.setAdress(adress);
        return userRepository.save(newUser);
    }
}
