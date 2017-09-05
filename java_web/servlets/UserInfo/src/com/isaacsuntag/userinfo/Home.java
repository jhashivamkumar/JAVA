package com.isaacsuntag.userinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first_name = "Unknown";
		String last_name = "Unknown";
		String lang = "Unknown";
		String hometown = "Unknown";
		if(request.getParameter("firstName") != null) {
			first_name = request.getParameter("firstName");
		}
		if(request.getParameter("lastName") != null) {
			last_name = request.getParameter("lastName");
		}
		if(request.getParameter("favoriteLanguage") != null) {
			lang = request.getParameter("favoriteLanguage");
		}
		if(request.getParameter("hometown") != null) {
			hometown = request.getParameter("hometown");
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome, "+first_name+" "+last_name+"</h1> <p>Your favorite language is: "+lang+"</p> <p>Your hometown is: "+hometown+"</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
