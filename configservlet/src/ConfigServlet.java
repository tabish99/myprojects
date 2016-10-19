import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ConfigServlet extends HttpServlet
{
	ServletConfig con;
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException 
        { 
		con=getServletConfig();
		String image=con.getInitParameter("image");
        String driver=con.getInitParameter("driver");
  		res.setContentType("text/html");
     		PrintWriter out=res.getWriter();
		out.println("<html><body>");
 		out.println("iii "+image);
		out.println("ddd "+driver);
		out.println("</body></html>");
	}
}
















