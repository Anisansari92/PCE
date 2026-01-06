package Exceptionalhandling;

import java.sql.SQLException;

public class ParentApp {

	public static void main(String[] args) {
		disp();
	}
	static void disp() {
		System.out.println("Hello from disp");
		try {
		disp();
		}catch(Error e) {
			System.out.println("Error handle");
		}
	}
}