import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java .util.*;


public class HeaderServlet extends HttpServlet
{
	PrintWriter out;
	public void service(HttpServletResponse req,HttpServletRequest res)throws ServletException,IOException
	{

	req.setContentType("text/html");
	out=req.getWriter();
	Enumeration e=res.getHeaderNames();
	while(e.hasMoreElements())
	{
		String name=(String)e.nextElement();
		String value=req.getHeader(name);
		out.println(name+" eee "+value);
		out.println("<br>");
	}
  	
	}
}