package Exceptionalhandling;

import java.util.Scanner;

public class ExceptionDemoApp {
	public static void main(String[] args) {
		System.out.println("Connection Establish");
		Scanner aa=new Scanner(System.in);
		System.out.println("Enter the value");
		int a= aa.nextInt();
		System.out.println("Please enter value to divide");
		int b= aa.nextInt();
		try {
			int c=a/b;
			System.out.println(c);
			
			System.out.println("Please enter size of an array");
			int size=aa.nextInt();
			
			int arr[]=new int[size];
			
			System.out.println("Please enter index no. arr");
			int n = aa.nextInt();
			
			arr[n]=999;
		}
		catch(ArithmeticException e) {
			System.out.println("Divided by zero is not allow");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array no. within range");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Please enter the positive size of array");
		}
		catch(Exception e) {
			System.out.println("Divided by zero is not allowed");
		}
		System.out.println("Connection is Terminated");
	}
}