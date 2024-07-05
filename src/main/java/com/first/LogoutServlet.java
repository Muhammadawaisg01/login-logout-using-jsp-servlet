

package com.first;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("logout")
public class LogoutServlet extends  HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			
		HttpSession session = req.getSession();
		session.removeAttribute("email"); 
		session.removeAttribute("password");
		res.sendRedirect("login");
		
	}
	
}
