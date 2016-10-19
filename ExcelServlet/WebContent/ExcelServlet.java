import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java .util.*;


public class ExcelServlet extends HttpServlet
{
	PrintWriter out;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{

	res.setContentType("application/vnd.ms-excel");
	out=res.getWriter();
		out.println("names\thindi\tenglish\tmaths\ttotal");
		out.println("lalu\t35\t34\t56\t=sum(b2:d2)");
	
	}
}