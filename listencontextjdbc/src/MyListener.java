import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class MyListener implements ServletContextListener
{
	public void contextInitialized(ServletContextEvent e)
	{
     		
		try
 		{
		ServletContext ctx=e.getServletContext();
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c=DriverManager.getConnection("Jdbc:Odbc:mydsn");
		ctx.setAttribute("con",c);
		System.out.println("context created");
		}
		catch(Exception e2){}
		
	}
	public void contextDestroyed(ServletContextEvent e1)
	{}

}