import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.sql.DataSource;

public class JndiValue implements Servlet {


   public void init(ServletConfig con)
   {
	   System.out.println("init");
   }

  public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException 
   {
	  System.out.println("service");
     res.setContentType("text/html");
     DataSource wsdl=null;
     String s=null;
     try {
    	 
    	 // Properties p=new Properties();
    	 // p.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
    	 // p.put(Context.PROVIDER_URL, "t3://localhost:7001");
		InitialContext initialContext = new InitialContext();
		wsdl = (DataSource) initialContext.lookup("jdbc/dataconnect");
		s = (String) initialContext.lookup("configjndiURL");
		
	} catch (NamingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     PrintWriter out=res.getWriter();  
     out.println("<html><body>");
     out.println("hello servlet 3"+ wsdl.toString()+"   "+s);
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
