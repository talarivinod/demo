package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;  
class Select{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/jdbc","root","vedas");  
 Statement stmt=con.createStatement();
// ResultSet rs=stmt.executeQuery("select * from employee"); 
// ResultSet rs=stmt.executeQuery("select * from employee where emp_lastname='kumar' and emp_salary<=55000"); 
 ResultSet rs=stmt.executeQuery("select * from employee where emp_firstname='seena' or emp_id<=50"); 
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getInt(6)); 
	con.close();  
}catch(Exception e){ System.out.println(e);}  
}
} 
