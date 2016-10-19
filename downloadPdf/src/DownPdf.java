import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class DownPdf extends HttpServlet
{
  

  public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
   {
	  System.out.println("service");
     res.setContentType("text/html");
     //res.setContentType("application/pdf");
	 ServletContext context=getServletContext();
	 InputStream is = context.getResourceAsStream("/pdf/IBMPDF.pdf");

	 byte b[]= new byte[1024];
	  int read;
	 OutputStream os =res.getOutputStream();
	 while((read=is.read(b))!=-1)
	 {
		 os.write(b, 0, read);
	 }
	 os.flush();
	 os.close();
	 // PrintWriter out=res.getWriter();  
     
   }

 

}