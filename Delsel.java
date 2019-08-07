package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;  
class Delsel{
public static void main(String args[]) throws ClassNotFoundException, SQLException{
	int emp_id;
	try{
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/jdbc","root","vedas");  
 Statement stmt=con.createStatement();
 
 try{
	 ResultSet rs=stmt.executeQuery("select * from employee "); 
	 while(rs.next())  
	 System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)); 
	 	//con.close();  
	 }catch(Exception e){ System.out.println(e);}  
	 

 //System.out.println("enter emp_id to delete");
//emp_id = in.nextInt();
String query="Delete from employee where emp_id=11 or emp_lastname='jagu'";
int c=stmt.executeUpdate(query);
if (c==0)
System.out.println("Data not found");
else{System.out.println("Data deleted successfully");
	
	ResultSet rs1=stmt.executeQuery("select * from employee where emp_id=25 and emp_lastname='malli'");
	
	while(rs1.next())  
		System.out.println(rs1.getInt(1)+"  "+rs1.getString(2)+"  "+rs1.getString(3)+" "+rs1.getString(4)+" "+rs1.getInt(5)+" "+rs1.getString(6)); 
			

}
		
stmt.close();
	con.close();

}catch(Exception e){ System.out.println(e.getMessage());}
	
} 
}

