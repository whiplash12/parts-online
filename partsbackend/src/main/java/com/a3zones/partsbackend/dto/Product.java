package com.a3zones.partsbackend.dto;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;
	private String product_code;
	private String product_name;
	private String product_brand;
	@JsonIgnore
	private String product_description;
	private double product_unit_price;
	private int product_quantity;
	@JsonIgnore
	private boolean product_is_active;
	@JsonIgnore
	private int product_category_id;
	@JsonIgnore
	private int product_supplier_id;
	private int product_purchases;
	private int product_views;
	
	public Product() {
		this.product_code = "A3Z" + UUID.randomUUID().toString().substring(26).toUpperCase();
	}
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_brand() {
		return product_brand;
	}
	public void setProduct_brand(String product_brand) {
		this.product_brand = product_brand;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public double getProduct_unit_price() {
		return product_unit_price;
	}
	public void setProduct_unit_price(double product_unit_price) {
		this.product_unit_price = product_unit_price;
	}
	public int getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}
	public boolean isProduct_is_active() {
		return product_is_active;
	}
	public void setProduct_is_active(boolean product_is_active) {
		this.product_is_active = product_is_active;
	}
	public int getProduct_category_id() {
		return product_category_id;
	}
	public void setProduct_category_id(int product_category_id) {
		this.product_category_id = product_category_id;
	}
	public int getProduct_supplier_id() {
		return product_supplier_id;
	}
	public void setProduct_supplier_id(int product_supplier_id) {
		this.product_supplier_id = product_supplier_id;
	}
	public int getProduct_purchases() {
		return product_purchases;
	}
	public void setProduct_purchases(int product_purchases) {
		this.product_purchases = product_purchases;
	}
	public int getProduct_views() {
		return product_views;
	}
	public void setProduct_views(int product_views) {
		this.product_views = product_views;
	}
	
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_code=" + product_code + ", product_name=" + product_name
				+ ", product_brand=" + product_brand + ", product_description=" + product_description
				+ ", product_unit_price=" + product_unit_price + ", product_quantity=" + product_quantity
				+ ", product_is_active=" + product_is_active + ", product_category_id=" + product_category_id
				+ ", product_supplier_id=" + product_supplier_id + ", product_purchases=" + product_purchases
				+ ", product_views=" + product_views + "]";
	}
	
	

}
