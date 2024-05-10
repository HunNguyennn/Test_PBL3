package niit.session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/show-cookie"})
public class ShowCookie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[] cookies = req.getCookies();
		String usernameString = "";
		resp.setContentType("text/html");
		//cần kiểm tra có cookie hay không --> có thể xảy ra lỗi nullpointer vd trong trường hợp dùng web ẩn danh
		if(cookies != null)
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("username")) {
					usernameString = cookie.getValue();
					PrintWriter printWriter = resp.getWriter();
					printWriter.write("Username là "+ usernameString);
				}
			}
		
	}
}
