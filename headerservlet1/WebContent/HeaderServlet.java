import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java .util.*;


public class HeaderServlet extends HttpServlet
{
	PrintWriter out;
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	res.setContentType("text/html");
	out=res.getWriter();
	/*Enumeration e=res.getHeaderNames();
	while(e.hasMoreElements())
	{
		String name=(String)e.nextElement();
		String value=req.getHeader(name);
		out.println(name+" eee "+value);
		out.println("<br>");
	}
	*/
  	out.println("ContentPath"+req.getContentLength()); 
	out.println("ContentType"+req.getContentType()); 	
	out.println("Method"+req.getMethod());
	out.println("RequstURI"+req.getRequestURI());
	out.println("Protocol"+req.getProtocol());
	}
}