package MethodOverriding;

public class ParentOverHidingApp {
	public static void main(String[] args) {
		PParentss p2 = new PParentss();
		p2.disp();
		System.out.println("---------Yesss-----------");
		CChildss c1 = new CChildss();
		c1.disp();
		System.out.println("---------Yesss-----------");
		PParentss p3 = new CChildss();
		p3.disp();	
		System.out.println("---------Yesss-----------");
	}
}

class PParentss{
	static void disp() {
		System.out.println("This is Parent class");
	}
}

class CChildss extends PParentss{
	static void disp() {
		System.out.println("This is Child class");
	}
}