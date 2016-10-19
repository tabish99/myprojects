import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class RedirectServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
 	{
		res.setContentType("text/html");         			
 		PrintWriter out=res.getWriter();
 		out.println("<html><body>");
		String s="before despatcher";
		out.println(s);
	
		try{
			req.setAttribute("name","decat"); 			
			ServletContext ctx=getServletContext();
			ServletContext ctx1=ctx.getContext("http://localhost:7001/s5");
			RequestDispatcher rd=ctx1.getRequestDispatcher("demoservlet1");
			rd.forward(req,res);
		    }	
		   catch(Exception e)
 			{out.println("rd excp");}	
		out.println("after dispatcher");
		out.println("</body></html>");
	}

}
