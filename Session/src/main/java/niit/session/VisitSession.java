package niit.session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/visit-session"})
public class VisitSession extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int visitTime = 0;
		
		HttpSession session = req.getSession();
		if(session.getAttribute("visitTime") != null) {
//			So, in any instances when we try to convert data type of object, we cannot directly downcast or upcast to a specified data type. 
//			Direct casting will not work and it throws ClassCastException. Instead, we can use
//			String.valueOf() method. It converts different types of values like int, long, boolean, character, float etc., into the string. 
//			Lỗi khi downcast từ lớp cha (object) về lớp con (int) nên phải dùng explicit cast (int)

			visitTime = (int)session.getAttribute("visitTime");
		}
		visitTime++;	

		session.setAttribute("visitTime", visitTime);
		
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<p>Bạn đã truy cập " + visitTime + " lần </p>");
	}
}
