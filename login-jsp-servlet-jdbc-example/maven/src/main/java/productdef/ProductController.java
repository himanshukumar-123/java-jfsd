package productdef;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Product;
import com.service.ProductService;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Product product = new Product();
		PrintWriter pw = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("simple.html");
		response.setContentType("text/html");
		ProductService ps = new ProductService();
		
		
		int id= Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String Pname=request.getParameter("pname");
		product.setId(id);
		product.setName(name);
		product.setProduct_name(Pname);
		pw.println("<footer>"+ps.addProduct(product)+"</footer>");
		rd.include(request, response);
	}

}
