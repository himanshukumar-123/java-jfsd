package com.learnersAcademy.servlets;
import java.util.ArrayList;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.learnersAcademy.dao.LearnersAcademyDaoImp;
import com.learnersAcademy.populateDb.PopulateDb;

/**
 * Servlet implementation class Dashboard
 */
@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dashboard() {
        super();
    }
        private void populateDatabaseAndSetSessionAttrib1(HttpServletRequest request) {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
			// TODO Auto-generated method stub

			populateDatabaseAndSetSessionAttrib1(request);

			
			request.setAttribute("la_classes", getClassesInAcademy());
			

			request.getRequestDispatcher("dashboard.jsp").forward(request, response);
		}

	private Object getClassesInAcademy() {
		// TODO Auto-generated method stub
		return null;
	}

	private void populateDatabaseAndSetSessionAttrib(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
