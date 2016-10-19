package org.tabish.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class Excel
{
       public static void  main(String...d)
        {
          Connection myconnection=null;
          Statement mystatement=null; 
          String mysql=""; 
          ResultSet resultset; 
             
          try
              {
 	 	Class.forName("sun.jdbc.odbc.jdbcodbcDriver");
                myconnection=DriverManager.getConnection("jdbc:odbc:excel");     
                mystatement=myconnection.createStatement();
                mysql="select * from [sheet1$]";
                resultset=mystatement.executeQuery(mysql);
                  while(resultset.next())
                   {
                    System.out.println(resultset.getString("name"));
                    System.out.println(resultset.getString("salary"));  
                   }
              }catch(Exception e)
                {
                  System.err.println(e); 
                }  
         }                
}