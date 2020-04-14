package com.a3zones.partsbackend.dao;

import java.util.List;

import com.a3zones.partsbackend.dto.Category;

public interface CategoryDAO {
	
	public boolean addCategory(Category category);
	public List<Category> listCategories();
	public Category getCategory(int id);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(Category category);

}
