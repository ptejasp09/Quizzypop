package com.quizgram.quizgrambackend.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizgram.quizgrambackend.models.Question;
import com.quizgram.quizgrambackend.models.QuizResult;
import com.quizgram.quizgrambackend.repository.QuizResultRepository;
import com.quizgram.quizgrambackend.services.QuizResultService;

import java.util.Collections;
import java.util.List;

@Service
public class QuizResultServiceImpl implements QuizResultService {

    @Autowired
    private QuizResultRepository quizResultRepository;

    @Override
    public QuizResult addQuizResult(QuizResult quizResult) {
        return quizResultRepository.save(quizResult);
    }

    @Override
    public List<QuizResult> getQuizResults() {
        return quizResultRepository.findAll();
    }

    @Override
    public List<QuizResult> getQuizResultsByUser(Long userId) {
        return quizResultRepository.findByUserId(userId);
    }
}
