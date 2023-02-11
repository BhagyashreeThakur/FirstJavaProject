package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;
public class CP {
static Connection con;
public static Connection createC() {
	//load the driver
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","Bhagyashree@1234");
	
} catch(Exception e) {
	e.printStackTrace();
}
	return con;
}
}
