package com.quizgram.quizgrambackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
/*
 * @Getter
 * 
 * @Setter
 */
@ToString
@Table(name = "categories")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long catId;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Quiz> quizzes = new ArrayList<>();

	public Long getCatId() {
		return catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Quiz> getQuizzes() {
		return quizzes;
	}

	public void setQuizzes(List<Quiz> quizzes) {
		this.quizzes = quizzes;
	}

}
