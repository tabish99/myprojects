package org.tabish.jdbc._4type;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class TestDb2
{

 public static void main(String...P)
{
    try {
           //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   	    DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
         
           Connection c=DriverManager.getConnection("Jdbc:Odbc:mydsn");
            Statement s=c.createStatement();  
            String t2="new entry";
             int t1=4;
             int x=s.executeUpdate("insert into emp1 values('"+t1+"','"+t2+"')");

            System.out.print(x);
            ResultSet rs=s.executeQuery("select * from emp1"); 
            while(rs.next())
            {
		System.out.print(rs.getString(1));
	        System.out.println(rs.getString(2));        
            }
         }
         catch(Exception e)
          {
             System.out.println(e);
           }
}
}