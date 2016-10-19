import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class MySessionListener implements HttpSessionListener
{

	public void sessionCreated(HttpSessionEvent e)
	{
		try 
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection c=DriverManager.getConnection("Jdbc:Odbc:mydsn");
			
			HttpSession s=e.getSession();
			s.setAttribute("con",c);
			System.out.println("session created");
		}
		catch(Exception e1)
		{

		}
	}

	public void sessionDestroyed(HttpSessionEvent e2)
	{
	}
}
