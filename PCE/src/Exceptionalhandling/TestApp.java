package Exceptionalhandling;
import java.util.*;

public class TestApp {
		public static void main(String []args) {
			System.out.println("Main connection Esta...");
			Test2 t2 = new Test2();
			t2.alpha();
			System.out.println("Main connection Termi..");
		}
	}

	class Test2{
		void alpha() {
			System.out.println("connection 1 stablished");
			Test3 t3 = new Test3();
			t3.beta();
			System.out.println("connection 1 terminated");	
		}
	}
	class Test3 {
		void beta() {
			System.out.println("connection 2 stablished");
			Test4 t4 = new Test4();
			t4.gama();
			System.out.println("connection 2 terminated");
		}
	}
	
	class Test4{
		void gama() {
			System.out.println("connection 3 stablished");
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter number 1");
			int a = sc.nextInt();
			System.out.println("Enter number 2");
			try {
				int b = sc.nextInt();
			     int c = a/b;
			     System.out.println(c);
			}
			catch (Exception e ){
				System.out.println("Exception handled by gama");	
			}
			System.out.println("connection 3 terminated");
		}
	}