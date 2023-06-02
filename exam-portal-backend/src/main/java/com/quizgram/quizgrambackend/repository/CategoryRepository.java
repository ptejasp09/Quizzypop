package com.quizgram.quizgrambackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.quizgram.quizgrambackend.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
