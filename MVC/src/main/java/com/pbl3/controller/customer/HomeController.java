package com.pbl3.controller.customer;

import java.io.IOException;
import java.util.ArrayList;

import javax.security.auth.login.AccountException;

import com.pbl3.model.Product;
import com.pbl3.model.User;
import com.pbl3.service.AccountService;
import com.pbl3.service.ProductService;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/homepage"})
public class HomeController extends HttpServlet{
	@Override
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String keywordString = req.getParameter("keyword");
//		if(keywordString == null) {
//			keywordString = "";
//		}
//		ArrayList<User> users = AccountService.query(keywordString);
//		req.setAttribute("users", users);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/customer/homepage.jsp");
		requestDispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/customer/searchProduct.jsp");
		String keywordString = req.getParameter("keyword");
		System.out.println(keywordString);
		if(keywordString == null) {
			keywordString = "";
		}
		ArrayList<Product> products = ProductService.query(keywordString);
		req.setAttribute("products", products);
		requestDispatcher.forward(req, resp);
	}
}
