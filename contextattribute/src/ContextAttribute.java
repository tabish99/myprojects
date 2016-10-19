import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ContextAttribute extends HttpServlet
{
 	 PrintWriter out;
	 
 	 public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
 	{
		res.setContentType("text/html");         			
 		PrintWriter out=res.getWriter();
 		//out.println("<html><body>");
					
		ServletContext ctx=getServletContext();  //one context per application war
		Integer count=(Integer)ctx.getAttribute("count");
		
		if(count==null)
		count=new Integer(0);
		
		count=new Integer(count.intValue()+1);
 		ctx.setAttribute("count",count);
 		
		out.println("<html><body>");
		out.println(count.intValue());	
		out.println("hello "+ctx.getInitParameter("context_param_name"));
		out.println("</body></html>");
	}
}