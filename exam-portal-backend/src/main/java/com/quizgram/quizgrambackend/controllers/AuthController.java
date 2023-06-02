package com.quizgram.quizgrambackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.quizgram.quizgrambackend.models.LoginRequest;
import com.quizgram.quizgrambackend.models.LoginResponse;
import com.quizgram.quizgrambackend.models.User;
import com.quizgram.quizgrambackend.services.AuthService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    AuthService authService;


    @PostMapping("/register")
    public User registerUser(@RequestBody User user) throws Exception {
        return authService.registerUserService(user);
    }

    @PostMapping("/login")
    public LoginResponse loginUser(@RequestBody LoginRequest loginRequest) throws Exception {
        return authService.loginUserService(loginRequest);
    }

}
