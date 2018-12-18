package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import entity.Entity;
public class ConnectionDemo
{
public void connection()
{
	
          Entity e=new Entity();
           
           try
   		{
   			Class.forName("oracle.jdbc.driver.OracleDriver");
   			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521/orcl","hkoppine","hkoppine");
   		    PreparedStatement pst=cn.prepareStatement("insert into flight values(?,?,?,?)");
   		         pst.setString(1, e.eName);
   		         pst.setString(2,e.eId );
   		         pst.setString(3,e.dept);
   		         
   		         pst.executeUpdate();
   		      PreparedStatement pst1=cn.prepareStatement("select * from flight");     
   		      ResultSet r=pst1.executeQuery();
   		      while(r.next())

   		      {
   		    	  System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4));
   		      }
   		    
   		}
   		catch(Exception e1)
   		{
   	         e1.printStackTrace();
   		}
}
}
           
           