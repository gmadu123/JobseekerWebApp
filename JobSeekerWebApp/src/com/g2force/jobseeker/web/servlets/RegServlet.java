package com.g2force.jobseeker.web.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.g2force.jobseeker.web.models.UserDTO;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
        
    	super();
    	
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("Served at: " + request.getContextPath() + "\n");
		
/*		String FirstName = request.getParameter("fname");
		String LastName = request.getParameter("lname");
		String UserName = request.getHeader("uname");
		String Password = request.getParameter("psswd");
		String CPassword = request.getParameter("cpsswd");
		String DOB = request.getHeader("dob");
		String Email = request.getParameter("email");
		String Telephone = request.getParameter("tel");
		String Address = request.getHeader("addr");
		String Zip = request.getHeader("zip");*/
		
//		boolean headEmpty = response.getHeaderNames().isEmpty();
		
/*		response.getWriter().println("FirstName is: " + FirstName + "\n");
		response.getWriter().println("LastName is: " + LastName + "\n");
		response.getWriter().println("UserName is: " + UserName + "\n");
		response.getWriter().println("Password is: " + Password + "\n");
		response.getWriter().println("Confirm Password is: " + CPassword + "\n");
		response.getWriter().println("Date of Birth is: " + DOB + "\n");
		response.getWriter().println("Email is: " + Email + "\n");
		response.getWriter().println("Telephone is: " + Telephone + "\n");
		response.getWriter().println("Address is: " + Address + "\n");
		response.getWriter().println("Zip Code is: " + Zip + "\n");
		response.getWriter().println("" +response.getHeaderNames() + "\n");*/
//		response.getWriter().append(request.getContextPath() + "\n").append("is get headers empty ? " + headEmpty);
		
        
        UserDTO user = new UserDTO();
        
    	user.setFirstName(request.getParameter("fname"));
    	user.setLastName(request.getParameter("lname"));
    	user.setUserName(request.getParameter("uname"));
    	user.setPassword(request.getParameter("psswd"));
    	user.setDateOfBirth(request.getParameter("dob"));
    	user.setAddress(request.getParameter("addr"));
    	user.setEmail(request.getParameter("email"));
    	user.setTelephone(request.getParameter("tel"));
    	user.setZip(request.getParameter("zip"));
		
		request.setAttribute("userInfo", user);
    	
		String nextJSP = "/JSP/reg_profile.jsp";
		request.getRequestDispatcher(nextJSP).forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
