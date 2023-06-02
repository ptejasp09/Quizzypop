package com.quizgram.quizgrambackend.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizgram.quizgrambackend.models.Category;
import com.quizgram.quizgrambackend.models.Quiz;
import com.quizgram.quizgrambackend.repository.QuizRepository;
import com.quizgram.quizgrambackend.services.QuizService;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    public QuizRepository quizRepository;

    @Override
    public Quiz addQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> getQuizzes() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz getQuiz(Long quizId) {
        return quizRepository.findById(quizId).isPresent() ? quizRepository.findById(quizId).get() : null;
    }

    @Override
    public Quiz updateQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public void deleteQuiz(Long quizId) {
        quizRepository.deleteById(quizId);
    }

    @Override
    public List<Quiz> getQuizByCategory(Category category) {
        return quizRepository.findByCategory(category);
    }
}
