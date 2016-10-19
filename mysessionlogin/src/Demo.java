import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Demo extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	res.setContentType("text/html");	
	PrintWriter out=res.getWriter();
	HttpSession s=req.getSession(true);
	
	
	 out.println("<html><body> <a href='demo1'>Demo_Servlet</a> </body></html>");

	s.setAttribute("name","tabish name is set in attribute");
	 }
}