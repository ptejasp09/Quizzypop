package com.quizgram.quizgrambackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizgram.quizgrambackend.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
