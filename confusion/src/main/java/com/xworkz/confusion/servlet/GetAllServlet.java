package com.xworkz.confusion.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.confusion.dto.ReadDto;
import com.xworkz.confusion.service.ReadServiceImpl;
@WebServlet(loadOnStartup = 1, urlPatterns = "/selectAll")
public class GetAllServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String gender=req.getParameter("gender");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String phone=req.getParameter("phone");
		
		
		int ageConvert = Integer.valueOf(age);
		
		ReadDto dto= new ReadDto(id, name, ageConvert, gender, email, password, phone);
		
		ReadServiceImpl impl= new ReadServiceImpl();
		boolean saved=impl.condition(dto);
		if(saved) {
			System.out.println("Validate and Save");
			id=id+1;
			System.out.println(id);
		}else {
			System.out.println("In Valid And Not Saved");
		}
	}

}
