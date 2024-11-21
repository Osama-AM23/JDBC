package com.xworkz.confusion.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.confusion.service.ReadServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/deleting")
public class GetIdServlet extends HttpServlet {
	
	public GetIdServlet() {
		System.out.println("GetIdServlet Constrctor");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		
		ReadServiceImpl impl= new ReadServiceImpl();
		int idConvert=Integer.valueOf(id);
		int value=impl.deleteDataById(idConvert);
		
		if(value>0) {
			System.out.println("ID : "+id);
			req.setAttribute("success", "id"+id+" Deleted");
		}else {
			System.out.println("Id Is Still there");
		}
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("Delete.jsp");
		dispatcher.forward(req, resp);
	}
}
