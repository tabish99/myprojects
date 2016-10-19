import javax.servlet.http.*;
import javax.servlet.*;

import java.io.*;

public class Send_Redirect1 extends HttpServlet
{
/*	
 * public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
 		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println("before");
		res.sendRedirect("demo");   // calling in same war
		out.println("after");
		out.println("</body></html>");		
	}
*/

public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
 		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println("before");       //data loss
		//res.sendRedirect("http://localhost:8090/demo1234/demoservlet1");   //calling one war to another war
		res.sendRedirect("/demo1234/demoservlet1");                        //both will work
		out.println("after");            //data loss
		out.println("</body></html>");		
	}

}