import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
			 
			RequestDispatcher rd=req.getRequestDispatcher("/demoservlet1"); //jsp page can be given to
			//rd.include(req,res);    // response would be included here no data loss
			rd.forward(req,res);    //     line 12,24  output loss  ,dont write anything data loss  
		    }	
		   catch(Exception e)
 			{out.println("rd excp");
			}	
		out.println("after dispatcher");
		out.println("</body></html>");
	}

}
