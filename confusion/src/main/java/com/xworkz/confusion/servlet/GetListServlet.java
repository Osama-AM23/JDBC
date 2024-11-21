package com.xworkz.confusion.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.confusion.service.ReadServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/lists")
public class GetListServlet extends HttpServlet{
	
	public GetListServlet() {
		System.out.println("GetListServlet of Constructor");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		int convertedId = Integer.valueOf(id);
		
		ReadServiceImpl impl=new ReadServiceImpl();
		String ref=impl.getListById(convertedId);
		
		if (ref != null) {
			System.out.println(ref);
			req.setAttribute("success", ref);
		} else {
			req.setAttribute("failure", "Id is not present");
		}

		RequestDispatcher dispatcher = req.getRequestDispatcher("GetList.jsp");
		dispatcher.forward(req,resp);

	}

}
