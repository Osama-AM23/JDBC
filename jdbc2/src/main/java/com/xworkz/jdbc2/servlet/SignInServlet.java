package com.xworkz.jdbc2.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.jdbc2.dto.SignInDTO;
import com.xworkz.jdbc2.service.SignInServiceImpl;

@WebServlet(urlPatterns = "/sign")
public class SignInServlet extends HttpServlet {
	
	public SignInServlet() {
		System.out.println("No-Args Constructor of SignIn Servlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id= req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		SignInDTO dto = new SignInDTO(id ,name, email, password);
		
		SignInServiceImpl impl= new SignInServiceImpl();
		boolean saved=impl.save(dto);
		
		System.out.println("Attempting to insert: " + dto.getName() + ", " + dto.getEmail());

	}
}
