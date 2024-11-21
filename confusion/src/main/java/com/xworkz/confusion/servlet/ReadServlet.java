package com.xworkz.confusion.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.confusion.dto.ReadDto;
import com.xworkz.confusion.service.ReadServiceImpl;
@WebServlet("/operation")
public class ReadServlet extends HttpServlet{
	
	public ReadServlet() {
		System.out.println("No Args Constructor of ReadServlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String gender=req.getParameter("gender");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String phone=req.getParameter("phone");
		
		int convertAge= Integer.valueOf(age);
		
		ReadDto dto= new ReadDto(id, name, convertAge, gender, email, password, phone);
		
		ReadServiceImpl serviceImpl= new ReadServiceImpl();
		boolean verify=serviceImpl.condition(dto);
		
		
		
		
	}

}
