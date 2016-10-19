package org.tabish.jdbc._4type;

import java.sql.*;
//import java.util.*;

class TestDb1
{

 public static void main(String...P)
{
    try {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   	
         Connection c=DriverManager.getConnection("Jdbc:Odbc:mydsn");
            Statement s=c.createStatement();  
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