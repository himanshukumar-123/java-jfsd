

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learnersAcademy.helpers.JsAlert;

/**
 * Servlet implementation class CreateAssignments
 */
@WebServlet("/CreateAssignments")
public class CreateAssignments extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAssignments() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		setRequestAttributes(request);

		request.getRequestDispatcher("create_assignments.jsp").forward(request, response);
	}

	private void setRequestAttributes(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("I in post");

		if (allFieldAreSelected(request)) {

			if (!pushFormDataToDatabase(request)) {
				
				response.getWriter().println(
						JsAlert.getAlert("Invalid assignment of class to subject and teacher", "createMapping"));
				
			} else {
				
				response.getWriter().println(JsAlert.getAlert("Assignment successfull", "Dashboard"));
				
			}

		} else {

			response.getWriter().println(JsAlert.getAlert("All fields are required", "createMapping"));

		}
		doGet(request, response);
	}

	private boolean pushFormDataToDatabase(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean allFieldAreSelected(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

}
