

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.learnersAcademy.helpers.JsAlert;
import com.learnersAcademy.helpers.RequestValidator;

/**
 * Servlet implementation class AddLaClasse
 */
@WebServlet("/AddLaClasse")
public class AddLaClasse extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String LA_CLASS_PARAM_KEY = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddLaClasse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			if (RequestValidator.requestHasParams(request, LA_CLASS_PARAM_KEY)) {

				if (pushLaClassToDatabase(request)) {

					response.getWriter().println(JsAlert.getAlert("Class added", "Dashboard"));

				} else {

					throw new Exception("Error adding Class");
				}

			} else {

				throw new Exception("Cannot add empty Class name");

			}
		} catch (Exception e) {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	}
	private boolean pushLaClassToDatabase(HttpServletRequest request) {
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
