import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class MyFilter1 implements Filter
{
	public void init(FilterConfig config)throws ServletException
	{
	
	}

	public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws ServletException,IOException
	{
		
		PrintWriter out=res.getWriter();//because response
		out.println("hello filter2");
		chain.doFilter(req,res);
		out.println("bye filter 2");
	}

	public void destroy()
	{
	}
}