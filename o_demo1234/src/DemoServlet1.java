import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DemoServlet1 implements Servlet
{
   public void init(ServletConfig con)
   {
	   System.out.println("init");
   }

  public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException 
   {
	  System.out.println("service");
     res.setContentType("text/html");
     PrintWriter out=res.getWriter();  
     out.println("<html><body>");
     out.println("hello servlet");
     out.println("</body></html>");          
   }

  public void destroy()
  {
	  System.out.println("destroy");
  }
  
  public ServletConfig getServletConfig()
   {
	  System.out.println("getservletconfig");
   return null;
   }
  
   public String getServletInfo()
  {
	   System.out.println("getservletinfo");
	   return null;
  }

}