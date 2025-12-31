package Inheritance;

public class Rule_1 {
	public static void main (String[] args) {
		Child c = new Child();
		System.out.println("c.a");
		System.out.println("-------------------------");
		c.disp();
	}
}

class Parent
{
	int a=10;
	int b=15;
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
	}
}

class Child extends Parent
{
	
}
