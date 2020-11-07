
package com.cybage.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cybage.pojos.Users;
import com.cybage.services.LoginServiceI;
import com.cybage.services.LoginServiceImpl;
import com.cybage.services.UserServiceI;
import com.cybage.services.UserServiceImpl;

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserServiceI us = new UserServiceImpl();
	LoginServiceI ls = new LoginServiceImpl();

	public CustomerServlet() {
		super();

	}
	
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
String action=request.getPathInfo();
System.out.println("action:"+action);
switch (action) {
case "getsports":
	System.out.println("sports");
	break;
case "get":
	System.out.println("login");
default:
	System.out.println("def");
	break;
}
		try {
			
			Users user = ls.authenticate(request.getParameter("username"), request.getParameter("password"));
			System.out.println(user);
			if(user!=null) {
				response.sendRedirect("welcome.jsp");
				HttpSession session=request.getSession();
				System.out.println(user.getAddress());
				session.setAttribute("email", user.getEmail());
			
			}
			else if(user==null) {
				response.sendRedirect("register.jsp");
			}
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			us.adduser(request.getParameter("username"), request.getParameter("address"),
					request.getParameter("password"), request.getParameter("phone"), request.getParameter("email"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
