package org.tabish.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
class Rsmd
{
	    public static void main(String...s1)
    	    {
              try{

                   Class.forName("sun.jbdc.odbc.JdbcOdbcDriver");
                   Connection c=DriverManager.getConnection("jdbc:odbc:oracledsn"); 
                   Statement s=c.createStatement();
                   ResultSet rs=s.executeQuery("select * from emp42");
                   ResultSetMetaData rsmd=rs.getMetaData();     
                       int count=rsmd.getColumnCount();  
                       System.out.println(count);
                  
                        for(int i=0;i<count;i++)
                         {
                            System.out.println(rsmd.getColumnName(i));
                            System.out.println(rsmd.getColumnType(i)); 
                         }
	         }			 
 		  catch(SQLException e)
                  {
                    e.printStackTrace();
                  }  
                   catch(Exception i)
                    {
                             
                    }
             }
} 