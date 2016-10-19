package org.tabish.jdbc._4type;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

class TestDb3
{

 public static void main(String...P)
{
    try {
           //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   	  Driver d=new sun.jdbc.odbc.JdbcOdbcDriver();
            
           String z="aa its four";  
            int t4=3;           
            Properties dbprop=new Properties(); 
           Connection c=d.connect("Jdbc:Odbc:mydsn",dbprop);
            Statement s=c.createStatement();  
             int x=s.executeUpdate("update emp1 set name='"+z+"' where id="+t4); 
           System.out.println(x); 
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