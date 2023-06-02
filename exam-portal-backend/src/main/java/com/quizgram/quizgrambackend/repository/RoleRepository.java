package com.quizgram.quizgrambackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizgram.quizgrambackend.models.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
}
