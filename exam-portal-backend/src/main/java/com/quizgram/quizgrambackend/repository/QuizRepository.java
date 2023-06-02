package com.quizgram.quizgrambackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizgram.quizgrambackend.models.Category;
import com.quizgram.quizgrambackend.models.Quiz;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    List<Quiz> findByCategory(Category category);
}
