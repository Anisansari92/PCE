package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/studentdb";
		String url1="oracle:jdbc:thin:@localhost:1521.xe";
		String user="root";
		String pass="admin";
		String sql="Select * from student";
		
		//loading the connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded successfully");
		
		//Establish the connection
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("Connection established successfully");
		
		//create statement
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery(sql);
				while(rs.next()) {
		System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getString(3)+" "+
		rs.getString(4));
				}

	}
}