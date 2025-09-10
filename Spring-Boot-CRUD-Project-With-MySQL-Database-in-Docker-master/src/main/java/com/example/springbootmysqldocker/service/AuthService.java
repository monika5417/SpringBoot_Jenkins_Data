package com.example.springbootmysqldocker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootmysqldocker.entity.User;
import com.example.springbootmysqldocker.repo.UserRepository;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepo;



    public String signup(String username, String password) {
        if (userRepo.findByUsername(username).isPresent()) {
            throw new RuntimeException("Username already exists!");
        }
        User user = new User(username, password);
        userRepo.save(user);
        return "User registered successfully!";
    }

    public String signin(String username, String password) {
        User user = userRepo.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found!"));

//        if (!passwordEncoder.matches(password, user.getPassword())) {
//            throw new RuntimeException("Invalid credentials!");
//        }

        return "You have logged in successfully";
    }
}
