import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Send_Redirect extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
 		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println("before");          //data loss
		res.sendRedirect("demo");   // calling in same war
		out.println("after");        //data loss
		out.println("</body></html>");		
	}	
/*
 * 
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
 		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println("before");
		//res.sendRedirect("http://localhost:8090/demo1234/demoservlet1");   //calling one war to another war
		res.sendRedirect("/demo1234/demoservlet1");                        //both will work
		out.println("after");
		out.println("</body></html>");		
	}
*/
}