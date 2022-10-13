package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="products")
public class Product {
	@Id
	private int id;
	private String name;
	private String Product_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct_name() {
		return Product_name;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", Product_name=" + Product_name + "]";
	}
	

}