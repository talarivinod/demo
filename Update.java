///*package com.jdbc;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;  
//class Update1{
//public static void main(String args[]){
//try{
//Class.forName("com.mysql.jdbc.Driver");  
//Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/jdbc","root","vedas");  
// Statement stmt=con.createStatement();
//String query="insert into employee values(11,'janu','jaggu',995991189,10000,'mrp1'),(12,'jaya','malli',910033603,25000,'mrp3')";
//int c=stmt.executeUpdate(query);
//System.out.println(c+"Rows inserted");
//stmt.close();
//	con.close();  
//}catch(Exception e){ System.out.println(e.getMessage());}  
//}
//} 
//*/
//
//
//
//
//
//
//package com.jdbc;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;  
//class Update{
//public static void main(String args[]) throws ClassNotFoundException, SQLException{
//Class.forName("com.mysql.jdbc.Driver");  
//Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/jdbc","root","vedas");  
// Statement stmt=con.createStatement();
// Scanner in=new Scanner(System.in);
// System.out.println("emp_id,emp_salary");
// int emp_id=in.nextInt();
// int emp_salary=in.nextInt();
//String query="Update employee Set emp_salary=bonus where emp_id='"+id+"'";
//int c=stmt.executeUpdate(query);
//if (c==0)
//System.out.println("Data not found");
//else
//	System.out.println("Data updated successfully");	
//stmt.close();
//	con.close();
//}
//} 
//
