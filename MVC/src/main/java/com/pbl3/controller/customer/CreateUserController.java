package com.pbl3.controller.customer;

import java.io.IOException;
import java.io.PrintWriter;

import com.pbl3.model.User;
import com.pbl3.service.AccountService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/create-user"})
public class CreateUserController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/customer/addUser.jsp");
		requestDispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		String phoneNumber = req.getParameter("phone-number");
		User user = new User(1,"test","123",name,address,phoneNumber,null);
		resp.sendRedirect(req.getContextPath() + "/");
		AccountService.addUser(user);
	}
}
