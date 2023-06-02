package com.quizgram.quizgrambackend.services;

import java.util.List;

import com.quizgram.quizgrambackend.models.Question;
import com.quizgram.quizgrambackend.models.Quiz;

public interface QuestionService {

    Question addQuestion(Question question);

    List<Question> getQuestions();

    Question getQuestion(Long quesId);

    Question updateQuestion(Question question);

    void deleteQuestion(Long questionId);

    //Extra Methods
    List<Question> getQuestionsByQuiz(Quiz quiz);

}
