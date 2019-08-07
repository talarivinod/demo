package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;  
class Insert{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/jdbc","root","vedas");  
 Statement stmt=con.createStatement();
String query="insert into employee values(20,'vinod','mouni',995991189,10000,'mvp1'),(35,'vinny','janu',99599118,28000,'atp3')";
int c=stmt.executeUpdate(query);
System.out.println(c+"Rows inserted");
stmt.close();
	con.close();  
}catch(Exception e){ System.out.println(e.getMessage());}  
}
} 
