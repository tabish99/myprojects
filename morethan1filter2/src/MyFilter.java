import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MyFilter implements Filter
{
	FilterConfig config;
	public void init(FilterConfig config)throws ServletException
	{
		
	this.config=config;
	System.out.println("hello ");
	}

	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws ServletException,IOException
	{
		ServletContext ctx=config.getServletContext();
		Integer count=(Integer)ctx.getAttribute("count");

		if(count==null)
		{
		count=new Integer(0);
		}	
		count=new Integer(count.intValue()+1);
		ctx.setAttribute("count",count);
		PrintWriter out=res.getWriter();//because response
		out.println("hello filter 1");
		chain.doFilter(req,res);
		out.println("bye filter 1");
	}

	public void destroy()
	{
	}
}