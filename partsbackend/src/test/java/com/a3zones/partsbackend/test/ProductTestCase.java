package com.a3zones.partsbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.a3zones.partsbackend.dao.ProductDAO;
import com.a3zones.partsbackend.dto.Product;

public class ProductTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static ProductDAO productDAO;
	private Product product;
	
	@BeforeAll
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.a3zones.partsbackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
	}
	
	@Disabled
	@Test
	public void testAddCategory() {
		product = new Product();
		product.setProduct_name("LED TV");
		product.setProduct_brand("SONY");
		product.setProduct_description("This is Description of Sony LED TV");
		product.setProduct_unit_price(65000);
		product.setProduct_quantity(2);
		product.setProduct_supplier_id(3);
		product.setProduct_category_id(1);
		assertEquals(true, productDAO.addProduct(product));
	}
	
	@Disabled
	@Test
	public void testGetProductById() {
		product = productDAO.getProductById(2);
		assertEquals("LED", product.getProduct_name());
	}
	
	@Disabled
	@Test
	public void testUpdateProduct() {
		product = productDAO.getProductById(4);
		product.setProduct_is_active(true);
		assertEquals(true, productDAO.updateProduct(product));
	}
	
	@Disabled
	@Test
	public void testDeleteProduct() {
		product = productDAO.getProductById(4);
		assertEquals(true, productDAO.deleteProduct(product));
	}
	
	@Disabled
	@Test
	public void testListCategory() {
		assertEquals(4, productDAO.listAllProducts().size());
	}
	
	@Disabled
	@Test
	public void testlistActiveProducts() {
		assertEquals(3, productDAO.listActiveProducts().size());
	}
	
	@Disabled
	@Test
	public void testlistActiveProductsByCategory() {
		assertEquals(2, productDAO.listActiveProductsByCategory(1).size());
	}
	
	@Disabled
	@Test
	public void testgetLatestActiveProducts() {
		System.out.println(productDAO.getLatestActiveProducts(2));
		//assertEquals(2, productDAO.getLatestActiveProducts(3).size());
	}

}
