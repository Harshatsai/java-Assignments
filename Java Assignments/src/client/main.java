package client;

import java.util.Scanner;

import db.ConnectionDemo;
import validation.Validation;
import entity.Entity;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Entity e=new Entity();
        Validation v=new Validation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee name:");
         e.eName=sc.next();
          boolean b1=v.name1(e.eName);
        System.out.println("Enter the employee id:");
        e.eId=sc.next();
       boolean b2= v.id1(e.eId);
        System.out.println("Enter the employee department");
        e.dept=sc.next();
       boolean b3= v.dept1(e.dept);
        if((b1==true)&&(b2==true)&&(b3==true))
        {
        	ConnectionDemo connectiondemo=new ConnectionDemo();
        	      connectiondemo.connection();
        }
        
		
	}

}
