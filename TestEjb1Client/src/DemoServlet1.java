
import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import pack.Demo;
import pack.DemoHome;

public class DemoServlet1 implements Servlet
	{
		public void init(ServletConfig con)
			{
				System.out.println("init");
			}

		public void service(ServletRequest req, ServletResponse res)
		        throws ServletException, IOException
			{
				res.setContentType("text/html");
				PrintWriter out = res.getWriter(); // object is made (connected
												   // to browser)
				out.println("<html><body>");
				InitialContext ctx;
				try
					{
						/* Properties p=new Properties();
						   p.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");//home stub is present
						   p.put(Context.PROVIDER_URL,"t3://localhost:7001");*/
						ctx = new InitialContext();

						Object home = ctx.lookup("registeringHome1");
					    DemoHome h = (DemoHome) PortableRemoteObject.narrow(home, DemoHome.class);
					    // to use for
																   // linux
																   // also(same
																   // as
																   // unicastremote
																   // object in
																   // rmi)
						
						
						Demo rstub = h.create();
						out.println("output: jndi ="+rstub.add(100, 200));

					} catch (Exception e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				out.println("hello servlet");

				out.println("</body></html>");
			}

		public void destroy()
			{
				System.out.println("destroy");
			}

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