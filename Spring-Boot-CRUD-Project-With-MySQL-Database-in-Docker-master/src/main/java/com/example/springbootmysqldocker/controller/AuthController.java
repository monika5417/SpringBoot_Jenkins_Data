package com.example.springbootmysqldocker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootmysqldocker.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public String signup(@RequestParam String username, @RequestParam String password) {
        return authService.signup(username, password);
    }

    @PostMapping("/signin")
    public String signin(@RequestParam String username, @RequestParam String password) {
        return authService.signin(username, password);
    }
}
