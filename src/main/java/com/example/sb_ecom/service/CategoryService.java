package com.example.sb_ecom.service;

import com.example.sb_ecom.model.Category;
import com.example.sb_ecom.payload.CategoryDTO;
import com.example.sb_ecom.payload.CategoryResponse;

import java.util.List;

public interface CategoryService  {

    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);



}
