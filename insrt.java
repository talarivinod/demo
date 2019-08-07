package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;  
class insrt{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/jdbc","root","vedas");  
 Statement stmt=con.createStatement();
String query="insert into employee values(10,'janu','jaggu',995991189,10000,'mrp'),(21,'jaya','malli',910033603,25000,'mrp2')";
int c=stmt.executeUpdate(query);
System.out.println(c+"Rows inserted");

ResultSet rs=stmt.executeQuery("select * from employee"); 
while(rs.next()) 
	//System.out.println("Selected employee list");
System.out.println("Selected employee list"+rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6));


stmt.close();
	con.close();  
}catch(Exception e){ System.out.println(e.getMessage());}  
}
} 