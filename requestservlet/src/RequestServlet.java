import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class RequestServlet extends HttpServlet
{

  public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
   {
      res.setContentType("text/html");      
       PrintWriter out=res.getWriter();
      out.println("<html><body>");
       String name=req.getParameter("name");  
        String pass=req.getParameter("pass");  
        
         if(name.equals("ducat")&&pass.equals("ducat"))
           {
             out.println("service method");    
           }
          else
            out.println("invalid user name and password");
   }

    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
     {
       res.setContentType("text/html");  
         PrintWriter out=res.getWriter();
      out.println("<html><body>");
       String name=req.getParameter("name");  
        String pass=req.getParameter("pass");
         
//             try{
//                  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//                  Connection c=DriverManager.getConnection("jdbc:odbc:mydsn");
//                  Statement s=c.createStatement();
//                 int x=s.executeUpdate("insert into emp values('"+name+"','"+pass+"')");
//                  ResultSet rs=s.executeQuery("select * from emp");
//                  while(rs.next())  
//                  {
//                     out.println(rs.getString(1));
//		     out.println(rs.getString(2));
//                     out.println("<br>");
//                  }
//                 }        
//                  catch(Exception e){}
             if(name.equals("ducat")&&pass.equals("ducat")){
            	 
             out.println("post method");
              out.println("</body></html>");
             }
      }

         public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
         {
          res.setContentType("text/html");      
       	PrintWriter out=res.getWriter();
      	out.println("<html><body>");
       	String name=req.getParameter("name");  
       	 String pass=req.getParameter("pass");  
       	  
       	  if(name.equals("ducat")&&pass.equals("ducat"))
       	    {
               out.println("doget method");    
            }
           else
            out.println("invalid user name and password");
        }
     
    
}
