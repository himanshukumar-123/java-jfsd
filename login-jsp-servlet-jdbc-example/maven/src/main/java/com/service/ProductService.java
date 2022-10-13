package com.service;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {
	
	ProductDao dao = new ProductDao();
	
	public String addProduct(Product p)
	{
		if(dao.addProduct(p)<1)
		{
			return "Successfully added";
		}
		else
		{
			return "Data Not Added Successfully";
		}
			
	}

}
