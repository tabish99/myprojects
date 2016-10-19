import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class ListenerTest implements ServletContextListener
{
	public void contextInitialized(ServletContextEvent e)
	{
     	System.out.println("APPLICATION INITIALISED");	
	}	
		
	public void contextDestroyed(ServletContextEvent e1)
	{
	System.out.println("APPLICATION SHUTTING DOWN");
	}
}