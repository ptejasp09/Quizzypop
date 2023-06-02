package com.quizgram.quizgrambackend.services;

import com.quizgram.quizgrambackend.models.LoginRequest;
import com.quizgram.quizgrambackend.models.LoginResponse;
import com.quizgram.quizgrambackend.models.User;

public interface AuthService {
    User registerUserService(User user) throws Exception;

    LoginResponse loginUserService(LoginRequest loginRequest) throws Exception;
}
