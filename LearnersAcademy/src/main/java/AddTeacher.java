

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learnersAcademy.helpers.JsAlert;
import com.learnersAcademy.helpers.RequestValidator;

/**
 * Servlet implementation class AddTeacher
 */
@WebServlet("/AddTeacher")
public class AddTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String TEACHER_PARAM_KEY = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTeacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			if (RequestValidator.requestHasParams(request, TEACHER_PARAM_KEY)) {

				if (pushTeachersInfoToDatabase(request)) {

					response.getWriter().println(JsAlert.getAlert("Teacher added", "Dashboard"));

				} else {

					throw new Exception("Error adding teacher");
				}

			} else {

				throw new Exception("Cannot add empty teacher name");

			}
		} catch (Exception e) {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	}

	private boolean pushTeachersInfoToDatabase(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
