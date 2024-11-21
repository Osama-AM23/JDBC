package com.xworkz.confusion.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.confusion.service.ReadServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/find")
public class SearchServlet extends HttpServlet {
	
	public SearchServlet() {
		System.out.println("SearchServlet Constructor");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String phone = req.getParameter("phone");
		ReadServiceImpl serviceImpl= new ReadServiceImpl();
		String ph =serviceImpl.getNameByPhone(phone);
		if(ph != null) {
			System.out.println("name "+ph);
			req.setAttribute("success", ph);
		}else {
			req.setAttribute("failure", "Name is not found");
			System.out.println("Name is not found");
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("searching.jsp");
		dispatcher.forward(req,resp);

	}

}
