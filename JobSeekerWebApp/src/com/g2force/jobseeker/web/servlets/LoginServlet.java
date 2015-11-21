package com.g2force.jobseeker.web.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/HTML/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	System.out.println("The initialization is now started!!!");
    }
    
    @Override
    public void destroy() {
    	// TODO Auto-generated method stub
    	super.destroy();
    	System.out.println("The destruction is now done!!!");
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		//String head = request.getHeader("REFERER");
		//boolean val = response.getHeaderNames().isEmpty();
		
/*		response.getWriter().append("UserName is: ").append(userName).append(" and pass is: ").append(password + "\n");
		System.out.println("Served at: doGet Method in JobSeekerWebApp..... !!!!!"); // prints on the console
		System.out.println("trying to print header... " + head); // prints on the console
		response.getWriter().println("111111111111111");
		response.getWriter().println("22222222222222222");
		response.getWriter().println(response.getHeaderNames());
		response.getWriter().append("" +response.getHeaderNames() + "\n");
		response.getWriter().append(request.getContextPath() + "\n").append("is get headers empty ? " + val);
*/		
		
/*		String nextJSP = "/JSP/user_profile.jsp";
		
		request.setAttribute("firstName", "Hello "+ firstName);
		request.setAttribute("lastName", " "+ lastName);

		request.getRequestDispatcher(nextJSP).forward(request, response);
*/		

		String name = "NaveenaUppala";
		response.getWriter().println(" Name from servlet is: " + name + "\n");
		response.getWriter().println("<h3><font color = purple>  Name from servlet with color is: " + name + "</font></h3>");
		//response.getWriter().println("<font color = purple>  Name from servlet with color is: " + name + "</font>");
		
/*		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		dispatcher.forward(request, response);
*/		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//System.out.println("Served at: doPost Method in JobSeekerWebApp..... !!!!!"); // prints on the console
		
	}

}
