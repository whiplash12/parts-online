package com.a3zones.partsbackend.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int category_id;
	private String category_name;
	private String  category_desc;
	private String category_img_url;
	private boolean category_is_active = true;
	
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getCategory_desc() {
		return category_desc;
	}
	public void setCategory_desc(String category_desc) {
		this.category_desc = category_desc;
	}
	public String getCategory_img_url() {
		return category_img_url;
	}
	public void setCategory_img_url(String category_img_url) {
		this.category_img_url = category_img_url;
	}
	public boolean isCategory_is_active() {
		return category_is_active;
	}
	public void setCategory_is_active(boolean category_is_active) {
		this.category_is_active = category_is_active;
	}
	
	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category_name=" + category_name + ", category_desc="
				+ category_desc + ", category_img_url=" + category_img_url + ", category_is_active="
				+ category_is_active + "]";
	}
	
	
	
}
