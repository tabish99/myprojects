

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class DemoServlet1 implements Servlet
{
   public void init(ServletConfig con)
   {
	   System.out.println("init");
   }

  public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException 
   {
     res.setContentType("text/html");
     PrintWriter out=res.getWriter(); //object is made (connected to browser)          
     out.println("<html><body>");
     out.println("hello servlet");
     out.println("</body></html>");          
   }

  public void destroy()
  {System.out.println("destroy");}
  
  public ServletConfig getServletConfig()
   {
	  System.out.println("getservlet config");
   return null;
   }
  
   public String getServletInfo()
   {
	   System.out.println("getservletinfo");
	   return null;
   }

}