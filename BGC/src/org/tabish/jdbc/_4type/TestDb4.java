package org.tabish.jdbc._4type;
import java.sql.*;
import java.util.*;

class TestDb4
{

 public static void main(String...P)
{
    try {
           //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       	   // DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
         
            System.setProperty("Jdbc.drivers","sun.jdbc.odbc.JdbcOdbcDriver");
           Properties dbprop=new Properties(); 
           Connection c=DriverManager.getConnection("Jdbc:Odbc:mydsn",dbprop);

             Statement s=c.createStatement();  
             int t1=4;
             int x=s.executeUpdate("delete from emp1 where id="+t1);

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