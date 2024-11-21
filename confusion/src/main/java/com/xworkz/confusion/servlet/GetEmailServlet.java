package com.xworkz.confusion.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.confusion.service.ReadServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/getEmail")
public class GetEmailServlet extends HttpServlet{
	
	public GetEmailServlet() {
		System.out.println("GetEmailServlet Constructor");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email");
		
		ReadServiceImpl serviceImpl= new ReadServiceImpl();
		String refrence=serviceImpl.updateByEmail(email);
		if(refrence != null) {
			req.setAttribute("success", refrence);
		}else {
			req.setAttribute("failure", "Not Update");
		}
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("GetMail.jsp");
		dispatcher.forward(req, resp);
	}

}
