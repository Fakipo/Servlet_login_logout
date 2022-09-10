package mappings;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletBasic
 */
@WebServlet("/ServletBasic")
public class ServletBasic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletBasic() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("Here we are in Get Method");
		String userName = (String)request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(userName != "" && userName != null) {
			session.setAttribute("userName", userName);
			context.setAttribute("userName", userName);
		}
		PrintWriter writer = response.getWriter();
		writer.println("<h3>We are Here for the Dub GET session= " + (String) session.getAttribute ("userName") + " :) and request =  " + (String)request.getParameter("userName") + " and context = " + (String) context.getAttribute ("userName") + " </h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		System.out.println("Here we are in Get Method");
		request.getParameter("userName");
		PrintWriter writer = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("userName", request.getParameter("userName"));
		writer.println("<h1>We are Here for the Dub POST</h1>" + (String) session.getAttribute("userName") + " :) and " + (String)request.getParameter("userName"));
		String []x = request.getParameterValues("location");
		for(int i = 0 ; i< x.length;i++) {
			writer.println("<h2> " + x[i] + " = location </h2>");
		}
	}

}
