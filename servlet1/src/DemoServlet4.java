

import javax.servlet.*;
import java.io.*;

public class DemoServlet4 implements Servlet
{
   public void init(ServletConfig con)
   {
   }

  public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException 
   {
     res.setContentType("text/html");
     PrintWriter out=res.getWriter(); //object is made (connected to browser)        
     out.println("<html><body>");
     out.println("hello servlet 2 ");
     out.println("</body></html>");          
   }

  public void destroy()
  {}
  
  public ServletConfig getServletConfig()
   {
   return null;
   }
  
   public String getServletInfo()
   {return null;
   }

}