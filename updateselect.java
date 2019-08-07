package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;  
class updateselect{
public static void main(String args[]) throws ClassNotFoundException, SQLException{
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/jdbc","root","vedas");  
 Statement stmt=con.createStatement();
 Scanner in=new Scanner(System.in);
 System.out.println("emp_id,emp_salary");
 int emp_id=in.nextInt();
 int emp_salary=in.nextInt();
String query="Update employee Set emp_salary='"+emp_salary+"' where emp_id='"+emp_id+"'";

int c=stmt.executeUpdate(query);
if (c==0)
System.out.println("Data not found");
else{
	//Statement stmt1=con.createStatement();
	
	//ResultSet rs=stmt.executeQuery("select * from employee where emp_firstname='seena'and emp_id<=80"); 
	
	//ResultSet rs=stmt.executeQuery("select * from employee where emp_firstname like 's%'"); 

	ResultSet rs=stmt.executeQuery("select emp_lastname,emp_salary from employee where emp_firstname like 's%'");
	
	while(rs.next())  
	//System.out.println(rs.getString(1));  // +" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getString(6)
		
	System.out.println(rs.getString(1)+" "+rs.getString(2));
	
	System.out.println("Data updated successfully");	}
stmt.close();
	con.close();
}
}

