import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class DemoServlet extends GenericServlet
{
  public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException
  {
    	 res.setContentType("text/html");   
      	 PrintWriter out=res.getWriter();
        String s=(String)req.getAttribute("name");
         out.println("<html><body>"); 
         out.println("hello servlet"+s); 
	 out.println("</body></html>"); 
  }

}