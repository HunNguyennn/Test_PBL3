package niit.session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/visit-cookie"})
public class VisitCookie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int visitTime = 0;
		
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("visitTime")) {
					visitTime = Integer.parseInt(cookie.getValue());
				}
			}
		}
		visitTime++;
		Cookie cookie = new Cookie("visitTime", Integer.toString(visitTime));
		resp.addCookie(cookie);
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<p> Bạn đã truy cập " + visitTime + " lần </p>");
	}
}
