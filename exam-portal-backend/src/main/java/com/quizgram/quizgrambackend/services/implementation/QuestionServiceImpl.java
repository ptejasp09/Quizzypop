package com.quizgram.quizgrambackend.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizgram.quizgrambackend.models.Question;
import com.quizgram.quizgrambackend.models.Quiz;
import com.quizgram.quizgrambackend.repository.QuestionRepository;
import com.quizgram.quizgrambackend.services.QuestionService;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestion(Long quesId) {
        return questionRepository.findById(quesId).isPresent() ? questionRepository.findById(quesId).get() : null;
    }

    @Override
    public Question updateQuestion(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public void deleteQuestion(Long questionId) {
        questionRepository.delete(getQuestion(questionId));
    }

    @Override
    public List<Question> getQuestionsByQuiz(Quiz quiz) {
        return questionRepository.findByQuiz(quiz);
    }
}
