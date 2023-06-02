package com.quizgram.quizgrambackend.services;

import java.util.List;

import com.quizgram.quizgrambackend.models.Category;
import com.quizgram.quizgrambackend.models.Quiz;


public interface QuizService {

    Quiz addQuiz(Quiz quiz);

    List<Quiz> getQuizzes();

    Quiz getQuiz(Long quizId);

    Quiz updateQuiz(Quiz quiz);

    void deleteQuiz(Long quizId);

    // Extra methods
    List<Quiz> getQuizByCategory(Category category);
}
