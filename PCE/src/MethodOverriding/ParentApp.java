package MethodOverriding;

public class ParentApp {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.disp();
		System.out.println("---------Yesss-----------");
		Child c = new Child();
		c.disp();
		System.out.println("---------Yesss-----------");
		Parent p1 = new Child();
		p1.disp();
		System.out.println("---------Yesss-----------");
	}
}

class Parent{
	void disp() {
		System.out.println("This is parent class");
	}
}

class Child extends Parent {
	void disp() {
		System.out.println("This is Child class");
	}
}