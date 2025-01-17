package niit.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Homepage extends HttpServlet {
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("Gọi phương thức khởi tạo");
		
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Gọi phương thức service");
		super.service(arg0, arg1);
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Gọi phương thức doGet()");
		resp.setContentType("text/html"); 
		PrintWriter printWriter = resp.getWriter();
		String messageString = "Hello java 21";
		String keywordString = req.getParameter("keyword");
		String messageDescString = "";
		if(keywordString == null) {
			keywordString = "";
		}else {
			messageDescString = "Bạn đã tìm kiếm từ khóa: " +keywordString;
		}
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
				+ "	      <form class=\"d-flex\" role=\"search\">\r\n"
				+ "	        <input class=\"form-control me-2\" name=\"keyword\" value = \""+ keywordString + "\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n"
				+ "	        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n"
				+ "	      </form>\r\n"
				+ "	    </div>\r\n"
				+ "	  </div>\r\n"
				+ "	</nav>\r\n"
				+ "	<div class=\"container mt-5\">\r\n"
				+ "		<div class=\"row\">\r\n"
				+ "			<div class=\"col-md-6\">\r\n"
				+ "			<p>\""  + messageDescString + "\"</p>"		
				+ "				<h3>Login</h3>\r\n"
				+ "				<form method=\"POST\">\r\n"
				+ "					<div class=\"mb-3\">\r\n"
				+ "						<label for=\"exampleInputEmail1\" class=\"form-label\">Email address</label>\r\n"
				+ "						<input type=\"text\" name = \"username\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n"
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
		System.out.println("Gọi phương thức doPost()");
		resp.setContentType("text/html");
		String usernameString =	req.getParameter("username");
		String passwordString =	req.getParameter("password");
		System.out.println("usernameString:"+ usernameString);
		System.out.println("passwordString:"+ passwordString);
		boolean isLoginSuccess = false;
//		if(usernameString == "admin" && passwordString == "admin") 
		//không sử dụng được vì nếu so sánh == tức là so sánh reference, xem cả 2 có phải là cùng 1 object không
		//do đó dùng .equal() để so sánh giá trị
		if(usernameString.equals("admin") && passwordString.equals("admin")) {
			isLoginSuccess = true;
		}
		PrintWriter printWriter = resp.getWriter();
		if(isLoginSuccess) {
			printWriter.write("Chào bạn "+ usernameString );
		}else {
			printWriter.write("Đăng nhập thất bại");
		}
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("Gọi phương thức destroy");
	}
}
