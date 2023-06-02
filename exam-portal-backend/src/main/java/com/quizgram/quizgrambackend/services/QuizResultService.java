package com.quizgram.quizgrambackend.services;

import java.util.List;

import com.quizgram.quizgrambackend.models.QuizResult;

public interface QuizResultService {
    QuizResult addQuizResult(QuizResult quizResult);
    List<QuizResult> getQuizResults();

    List<QuizResult> getQuizResultsByUser(Long userId);
}

