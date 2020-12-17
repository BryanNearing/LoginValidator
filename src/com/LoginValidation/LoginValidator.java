package com.LoginValidation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginValidator
 */
@WebServlet("/LoginValidator")
public class LoginValidator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValidator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie cookie = new Cookie("user", "admin");
		
		String username = request.getParameter("username");
		
		String password = request.getParameter("password");
		
		RequestDispatcher rd = null;
		
		if(username.equalsIgnoreCase("admin") && password.equals("password")) {
			HttpSession session = request.getSession();
			session.setAttribute("seshname", username);
			rd = request.getRequestDispatcher("loginsuccess.jsp");
			rd.forward(request, response);
		}
		else {
			rd = request.getRequestDispatcher("loginFailure.jsp");
			rd.forward(request, response);
			
		}
		
	}

}
