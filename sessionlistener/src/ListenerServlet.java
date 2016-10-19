import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class ListenerServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession s=req.getSession();
		String name=(String)s.getAttribute("name");		
		
		out.println("<html><body>");
		out.println(name);
		out.println("</body></html>");
		

	}
}