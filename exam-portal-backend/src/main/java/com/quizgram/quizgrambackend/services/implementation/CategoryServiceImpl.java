package com.quizgram.quizgrambackend.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quizgram.quizgrambackend.models.Category;
import com.quizgram.quizgrambackend.repository.CategoryRepository;
import com.quizgram.quizgrambackend.services.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategory(Long catId) {
        return categoryRepository.findById(catId).isPresent() ? categoryRepository.findById(catId).get() : null;
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long categoryId) {
        categoryRepository.delete(getCategory(categoryId));
    }
}
