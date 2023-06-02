package com.quizgram.quizgrambackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "quiz_results")
public class QuizResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quizResId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "total_obtained_marks")
    private float totalObtainedMarks;

    @Column(name = "attempt_datetime")
    private String attemptDatetime;

    @ManyToOne(fetch = FetchType.EAGER)
    private Quiz quiz;

	public Long getQuizResId() {
		return quizResId;
	}

	public void setQuizResId(Long quizResId) {
		this.quizResId = quizResId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public float getTotalObtainedMarks() {
		return totalObtainedMarks;
	}

	public void setTotalObtainedMarks(float totalObtainedMarks) {
		this.totalObtainedMarks = totalObtainedMarks;
	}

	public String getAttemptDatetime() {
		return attemptDatetime;
	}

	public void setAttemptDatetime(String attemptDatetime) {
		this.attemptDatetime = attemptDatetime;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

    

}
