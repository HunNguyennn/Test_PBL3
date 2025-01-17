package com.pbl3.controller.customer;

import java.io.IOException;
import java.sql.Date;

import com.pbl3.model.User;
import com.pbl3.service.AccountService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/edit-user"})
public class EditUserController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user_id = req.getParameter("userID");
		User user = AccountService.searchUser(user_id); 
		req.setAttribute("user", user);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/customer/editUser.jsp");
		requestDispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user_id = req.getParameter("userID");
		String user_name = req.getParameter("user-name");
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		String phoneNumber = req.getParameter("phone-number");
		Date dateOfBirth = Date.valueOf(req.getParameter("date-of-birth"));
		User user = (User)req.getAttribute("user");
		AccountService.editUser(user);
		resp.sendRedirect(req.getContextPath() + "/show-user?userID="+user_id);
	}
}

