package com.logininfo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Loginservlet extends HttpServlet {
	public String username,password;
	public void  doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		username=req.getParameter("username");
		password=req.getParameter("password");
		PrintWriter out = res.getWriter();
		
		if((username=="admin") && (password=="admin")) 
		{
			out.println("you have succesfully login the page");
			
		} else
		{
			out.println("login failed!");
		}
		
		out.println(""+username);
		out.println(""+password);
	
	}
}