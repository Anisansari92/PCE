package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTableDemo {

	public static void main(String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/studentdb";
		String url1="oracle:jdbc:thin:@localhost:1521.xe";
		String user="root";
		String pass="admin";
		String sql="create table phone (Id int primary key, Brand varchar(20), Price int)";
		String sql1="insert into phone values (1001,'Nokia',20000),(1002,'Samsung',30000)";
		
		//loading the connection
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded successfully");
		
		//Establish the connection
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("Connection established successfully");
		
		//create statement
		Statement st = con.createStatement();
		
		int i=st.executeUpdate(sql1);
		System.out.println(i +"row affected");

	}
}