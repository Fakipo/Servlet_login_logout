package mappings;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SubMenu
 */
@WebServlet("/SubMenu")
public class SubMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubMenu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		Long userId = (Long)session.getAttribute("userId");
		PrintWriter out = response.getWriter();
		System.out.println("we are here in the sub menu");
		System.out.println("userId = " + userId);
		if(userId == null) {
			out.println("<script>alert(\"You need to login first to enter this page\"); window.location.replace(\"html/loginPage.html\");</script>");
		//	request.getRequestDispatcher("html/loginPage.html").include(request, response);
		}
		else {
			out.println("<script>alert(\"Welcome to the subMenu Page\"); window.location.replace(\"html/subMenu.html\");</script>");
		//	request.getRequestDispatcher("html/subMenu.html").include(request, response);
		}
		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
