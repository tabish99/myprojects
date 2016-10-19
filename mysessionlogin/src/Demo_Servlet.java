import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Demo_Servlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	res.setContentType("text/html");	
	PrintWriter out=res.getWriter();
	HttpSession s=req.getSession(false);
	
	if(s==null)
	{
	 out.println("login kar lo");
	 out.println("<html><body> <a href='demo'>Demosetattribute</a> </body></html>");
	}
	else
	{
	 String name=(String)s.getAttribute("name");
	 out.println("<html><body>");
         out.println(name+s.isNew());
	}
	out.println("</body></html>");
	}
}