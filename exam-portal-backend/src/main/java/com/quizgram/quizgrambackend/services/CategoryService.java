package com.quizgram.quizgrambackend.services;

import java.util.List;

import com.quizgram.quizgrambackend.models.Category;

public interface CategoryService {

    Category addCategory(Category category);

    List<Category> getCategories();

    Category getCategory(Long catId);

    Category updateCategory(Category category);

    void deleteCategory(Long categoryId);
}
