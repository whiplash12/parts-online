package com.a3zones.partsbackend.dao;

import java.util.List;

import com.a3zones.partsbackend.dto.Product;

public interface ProductDAO {
	
	public Product getProductById(int productId);
	public List<Product> listAllProducts();
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(Product product);
	
	//Business Methods
	public List<Product> listActiveProducts();
	public List<Product> listActiveProductsByCategory(int categoryId);
	public List<Product> getLatestActiveProducts(int count);
	
}
