package Abstraction;
import java.util.Scanner;

public class ShapesApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of circle :");
		int r = sc.nextInt();
		disp(new Circle(r));
		
		System.out.println("");
		System.out.print("Enter base of triangle :");
		int b = sc.nextInt();
		System.out.print("Enter length of triangle :");
		int l = sc.nextInt();
		disp(new Triangle(b, l));
		
		System.out.println("");
		System.out.print("Enter side of square :");
		int a = sc.nextInt();
		disp(new Square(a));
		System.out.println("");
	}

	static void disp(Shapes s) {
		s.findarea();
		s.disparea();
	}
}

abstract class Shapes {
	double area;
	static float Pi = 3.14f;
	static float half = 0.5f;

	abstract void findarea();

	abstract void disparea();
}

class Circle extends Shapes {
	int r;

	public Circle(int r) {
		super();
		this.r = r;
	}
	void findarea() {
		area = Pi * r * r;
	}
	void disparea() {
		System.out.println("Area Of Circle : " + area);
	}
}

class Triangle extends Shapes {
	int b;
	int h;

	public Triangle(int b, int h) {
		super();
		this.b = b;
		this.h = h;
	}

	void findarea() {
		area = half * b * h;
	}

	void disparea() {
		System.out.println("Area Of Triangle : " + area);
	}
}

class Square extends Shapes {
	int a;

	public Square(int a) {
		this.a = a;
	}

	void findarea() {
		area = a * a;
	}

	void disparea() {
		System.out.println("Area Of Sqaure : " + area);
	}
}