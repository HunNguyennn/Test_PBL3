package niit.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.WritableByteChannel;

import javax.print.attribute.standard.JobOriginatingUserName;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/login"})
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter = resp.getWriter();
		String username = req.getParameter("username");;
		if(req.getAttribute("username") != null) {
			username = req.getParameter("username");
		}
		System.out.println(username);
		printWriter.write("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "	<meta charset=\"utf-8\">\r\n"
				+ "	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "	<title>Document</title>\r\n"
				+ "	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n"
				+ "	\r\n"
				+ "\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<nav class=\"navbar navbar-expand-lg bg-body-tertiary\">\r\n"
				+ "	  	<div class=\"container\">\r\n"
				+ "	    	<a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n"
				+ "	    	<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n"
				+ "	      		<span class=\"navbar-toggler-icon\"></span>\r\n"
				+ "	    	</button>\r\n"
				+ "	    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+ "	      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "	        <li class=\"nav-item\">\r\n"
				+ "	          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Trang chủ</a>\r\n"
				+ "	        </li>\r\n"
				+ "	        <li class=\"nav-item\">\r\n"
				+ "	          <a class=\"nav-link\" href=\"#\">Sinh Viên</a>\r\n"
				+ "	        \r\n"
				+ "	        <li class=\"nav-item\">\r\n"
				+ "	          <a class=\"nav-link disabled\" aria-disabled=\"true\">Disabled</a>\r\n"
				+ "	        </li>\r\n"
				+ "	      </ul>\r\n"
				+ "	    </div>\r\n"
				+ "	  </div>\r\n"
				+ "	</nav>\r\n"
				+ "	<div class=\"container mt-5\">\r\n"
				+ "		<div class=\"row\">\r\n"
				+ "			<div class=\"col-md-6\">\r\n"
				+ "				\r\n"
				+ "				<h3>Login</h3>\r\n"
				+ "				<form method=\"POST\">\r\n"
				+ "					<div class=\"mb-3\">\r\n"
				+ "						<label for=\"exampleInputEmail1\" class=\"form-label\">Username</label>\r\n"
				+ "						<input type=\"text\" value =\"" + username + "\" autocomplete = \"on\" name = \"username\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n"
				+ "						<div id=\"emailHelp\" class=\"form-text\">We'll never share your email with anyone else.</div>\r\n"
				+ "					</div>\r\n"
				+ "					<div class=\"mb-3\">\r\n"
				+ "						<label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\r\n"
				+ "						<input type=\"password\" name = \"password\" class=\"form-control\" id=\"exampleInputPassword1\">\r\n"
				+ "					</div>\r\n"
				+ "\r\n"
				+ "					<button type=\"submit\" class=\"btn btn-success\">Login</button>\r\n"
				+ "				</form>\r\n"
				+ "			</div>\r\n"
				+ "		</div>\r\n"
				+ "	</div>\r\n"
				+ "	\r\n"
				+ "\r\n"
				+ "	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if(username.equals("admin") && password.equals("admin")) {
			HttpSession session = req.getSession();
			session.setAttribute("username", username);
			
			resp.sendRedirect(req.getContextPath() + "/");
		}
		
		doGet(req, resp);
	}
}
