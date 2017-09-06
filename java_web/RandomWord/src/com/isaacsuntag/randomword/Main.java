package com.isaacsuntag.randomword;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Random random = new Random();
		String count = (String) session.getAttribute("count");
		Integer number;
		String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String string = "";
		for(int i=1; i<=10; i++) {
			string+=candidateChars.charAt(random.nextInt(candidateChars.length()));
		}
		session.setAttribute("string", string);
		Date today = new Date();
		session.setAttribute("date", today);
		
		if(count == null) {
			session.setAttribute("count", "0");
		}
		else {
			number = Integer.parseInt(count);
			number += 1;
			count = number.toString();
			session.setAttribute("count", count);
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/randomword.jsp");
        view.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
