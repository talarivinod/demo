package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;  
class Delete{
public static void main(String args[]) throws ClassNotFoundException, SQLException{
	Scanner in=new Scanner(System.in);
	int emp_id;
	try{
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/jdbc","root","vedas");  
 Statement stmt=con.createStatement();
 System.out.println("enter emp_id to delete");
 emp_id = in.nextInt();
String query="Delete from employee where emp_id=60 or emp_lastname='dhanu'";
int c=stmt.executeUpdate(query);
if (c==0)
System.out.println("Data not found");
else
	System.out.println("Data deleted successfully");	
stmt.close();
	con.close();

}catch(Exception e){ System.out.println(e.getMessage());}
	
} 
}

