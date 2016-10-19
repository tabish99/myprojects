package oracle;

import java.sql.*;

class OracleDsn
{
    public static void main(String...d)
    {
     try{
         Connection c=DriverManager.getConnection("jdbc:odbc:ORACLE_DSN","SYSTEM","Mypassword123$");
         String t1="english";
         int t3=100;
         
           Statement s=c.createStatement();
	
             s.executeUpdate("create table emp42(name varchar(26),salary integer)");
          
		 s.executeUpdate("insert into emp42 values('"+t1+"','"+t3+"')");

      	 	  ResultSet rs=s.executeQuery("select * from emp42");
        	 
            while(rs.next())
             {
       		System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
             }	s.close();
        }
        catch(SQLException e)
        {
          System.out.println(e); 
        }catch(Exception i)
         {
          System.out.println(i); 
         }  
     }
}
    