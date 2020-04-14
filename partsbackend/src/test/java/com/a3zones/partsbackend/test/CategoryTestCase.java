package com.a3zones.partsbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.a3zones.partsbackend.dao.CategoryDAO;
import com.a3zones.partsbackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;
	
	@BeforeAll
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.a3zones.partsbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	@Disabled
	@Test
	public void testAddCategory() {
		category = new Category();		
		category.setCategory_name("Power Banks");
		category.setCategory_desc("Description for Power Banks");
		category.setCategory_img_url("cat_4.png");
		assertEquals(true, categoryDAO.addCategory(category));
	}
	
	@Disabled
	@Test
	public void testGetCategory() {
		category = categoryDAO.getCategory(2);
		assertEquals("Mobile", category.getCategory_name());
	}
	
	@Disabled
	@Test
	public void testUpdateCategory() {
		category = categoryDAO.getCategory(1);
		category.setCategory_name("TV");
		assertEquals(true, categoryDAO.updateCategory(category));
	}
	
	@Disabled
	@Test
	public void testDeleteCategory() {
		category = categoryDAO.getCategory(9);
		assertEquals(true, categoryDAO.deleteCategory(category));
	}
	
	@Test
	public void testListCategory() {
		assertEquals(3, categoryDAO.listCategories().size());
	}
	
}
