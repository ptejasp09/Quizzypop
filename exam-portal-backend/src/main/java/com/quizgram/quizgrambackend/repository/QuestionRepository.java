package com.quizgram.quizgrambackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizgram.quizgrambackend.models.Question;
import com.quizgram.quizgrambackend.models.Quiz;

import java.util.List;


public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findByQuiz(Quiz quiz);
}
