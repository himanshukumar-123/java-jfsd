
package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Product;

public class ProductDao {
	
	public Session connection()
	{
		Configuration con= new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session s= sf.openSession();
		return s;
	}
	
	public int addProduct(Product p)
	{
		try
		{
			Session s = connection();
			Transaction t=s.beginTransaction();
			s.save(p);
			t.commit();
			return 0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return 1;
		}
			
	}

}
