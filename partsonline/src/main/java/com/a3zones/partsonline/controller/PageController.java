package com.a3zones.partsonline.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.a3zones.partsbackend.dao.CategoryDAO;
import com.a3zones.partsbackend.dao.ProductDAO;
import com.a3zones.partsbackend.dto.Category;
import com.a3zones.partsbackend.dto.Product;

@Controller
public class PageController {
	
	private static final Logger logger = LoggerFactory.getLogger(PageController.class);

	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	ProductDAO productDAO;

	/*
	 * Home Page
	 */
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("categories", categoryDAO.listCategories());
		mView.addObject("title", "Home");
		logger.info("Inside PageController Index method - Info");
		logger.debug("Inside PageController Index method - Debug");
		mView.addObject("userClicksHome", true);
		return mView;
	}

	/*
	 * Contact Us Page
	 */
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("title", "Contact Us");
		mView.addObject("userClicksContact", true);
		return mView;
	}

	/*
	 * About Us Page
	 */
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("title", "About Us");
		mView.addObject("userClicksAbout", true);
		return mView;
	}

	/*
	 * Show All Products
	 */
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mView = new ModelAndView("page");
		// Passing List of Categories
		mView.addObject("categories", categoryDAO.listCategories());
		mView.addObject("title", "All Products");
		mView.addObject("userClicksAllProducts", true);
		return mView;
	}

	/*
	 * Show Category wise Products
	 */
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mView = new ModelAndView("page");
		// Passing List of Categories
		mView.addObject("categories", categoryDAO.listCategories());
		// To fetch products based on Category
		Category category = null;
		category = categoryDAO.getCategory(id);
		mView.addObject("title", category.getCategory_name());
		// Passing a single category
		mView.addObject("category", category);
		mView.addObject("userClicksCategoryProducts", true);
		return mView;
	}
	
	/**
	 * Viewing a single product
	 */
	@RequestMapping(value = "/show/{id}/product")
	public ModelAndView showSingleProduct(@PathVariable int id) {
		ModelAndView mView = new ModelAndView("page");
		Product product = productDAO.getProductById(id);
		//Update View Count
		product.setProduct_views(product.getProduct_views());
		productDAO.updateProduct(product);
		
		mView.addObject("title", product.getProduct_name());
		mView.addObject("product", product);
		mView.addObject("userClicksShowProducts", true);
		
		return mView;
	}
	
}
