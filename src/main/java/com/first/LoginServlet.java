

package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		PrintWriter out = res.getWriter();
		
		HttpSession session = req.getSession();
		session.setAttribute("email", email); 
		session.setAttribute("password", pass); 
		
		
		if(!email.equals("") && pass.equals("aaa") ) {
			res.sendRedirect("welcome.jsp");
		}
		else {
			res.sendRedirect("login.jsp");
		}
		
		
	
	}
}
