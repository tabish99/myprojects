import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class ListenerServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();		
		out.println("<html><body>");
		ServletContext ctx=getServletContext();
		Connection c=(Connection)ctx.getAttribute("con");
		out.println("hello"+c);
		try
 		{
		
		Statement s=c.createStatement();
		
		ResultSet rs=s.executeQuery("select * from emp1");
		while(rs.next())
		{
		out.println("id"+rs.getString(1));
		out.println("name"+rs.getString(2));
		out.println("<br>");
		}
		}catch(Exception e)
			{out.println(e);}
		out.println("</body></html>");


	}
}