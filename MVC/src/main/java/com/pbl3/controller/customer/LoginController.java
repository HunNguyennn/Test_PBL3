package com.pbl3.controller.customer;

import java.io.IOException;
import java.util.ArrayList;

import javax.security.auth.login.AccountException;

import com.pbl3.model.User;
import com.pbl3.service.AccountService;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class LoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/customer/login.jsp");
//		ArrayList<User> users = AccountService.getAll();
//		for (User user : users) {
//			System.out.println(user.getUserID());
//		}
//		req.setAttribute("users", users);
		requestDispatcher.forward(req, resp);
	}
}
