package sai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class FlightDemo {

	public static void main(String[] args)throws ClassNotFoundException {
		// TODO Auto-generated method stub
               int flightNo;
               String flightName;
               String source;
               String destination;
               
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the flight number");
               flightNo=sc.nextInt();
               System.out.println("Enter the flight name");
               flightName=sc.next();
               System.out.println("Enter the source");
               source=sc.next();
               System.out.println("Enter the destination");
               destination=sc.next();
               
               try
       		{
       			Class.forName("oracle.jdbc.driver.OracleDriver");
       			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@10.219.34.3:1521/orcl","hkoppine","hkoppine");
       		    PreparedStatement pst=cn.prepareStatement("insert into flight values(?,?,?,?)");
       		         pst.setInt(1, flightNo);
       		         pst.setString(2,flightName );
       		         pst.setString(3, source);
       		         pst.setString(4, destination);
       		         pst.executeUpdate();
       		      PreparedStatement pst1=cn.prepareStatement("select * from flight");     
       		      ResultSet r=pst1.executeQuery();
       		      while(r.next())

       		      {
       		    	  System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getString(3)+" "+r.getString(4));
       		      }
       		    
       		}
       		catch(Exception e)
       		{
       	         e.printStackTrace();
       		}
               
               
               
	}

}
