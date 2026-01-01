package Polymorphism;

public class ParentApp {
	public static void main(String[] args)
	{
		Child c = new Child();
		c.disp();
	}
}

class Parent
{
	int x=10;
	void disp()
	{
		System.out.println(x);
	}
}

class Child extends Parent
{
	int x=20;
	void disp()
	{
		System.out.println(x);
	}
}

