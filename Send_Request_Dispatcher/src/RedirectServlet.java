import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
 					out.println(ctx.getContextPath()+"ctx");
 					 out.println("<br/>");
 					 out.println("<br/>");
 					       out.println(ctx.toString());
 					       out.println("<br/>");
			ServletContext ctx1=ctx.getContext("/demo1234");
					out.println(ctx1.getContextPath()+"ctx1");
			RequestDispatcher rd=ctx1.getRequestDispatcher("/demoservlet1");
			rd.include(req,res);
		    }	
		   catch(Exception e)
 			{out.println("rd excp");
 			out.println("exc ");
 			
			}	
		out.println("after 1 dispatcher");
		out.println("</body></html>");
	}

}
