package niit.session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/"})
public class HomePage extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		System.out.println(req.getContextPath());
		if(session.getAttribute("username")== null) {
			System.out.println(req.getContextPath() + "/login2.jsp");
			resp.sendRedirect(req.getContextPath() + "/login2.jsp");
		}
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("HomePage");
	}
}
