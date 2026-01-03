package InterfaceA;
//import java.util.Scanner;


public class CalciApp {
	public static void main(String[] args) {
//		Scanner aa = new Scanner(System.in);
//		System.out.print("Enter the nubmer");
//		int num1 = aa.nextInt();
//		
//		Scanner aa1 = new Scanner(System.in);
//		System.out.print("Enter the symbol");
//		String symbol = aa.next();
//		
//		Scanner aa2 = new Scanner (System.in);
//		System.out.print("Enter the number");
//		int num2 = aa.nextInt();
		
		duty(new AnisSoft());
		duty(new RoopaminfoTec());
		
	}
	static void duty(kodCalciApp kc) {
		kc.add();
		kc.sub();
		kc.mul();
		kc.div();
	}
}

class AnisSoft implements kodCalciApp{
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public void sub() {
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
	public void mul() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	public void div() {
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}
}

class RoopaminfoTec implements kodCalciApp{
	int a;
	int b;
	
	public RoopaminfoTec(int a ,int b) {
		this.a=a;
		this.b=b;		
	}
	
	public void add() {
		int c=a+b;
		System.out.println("Addition"+c);
	}
	public void sub() {
		int c=a-b;
		System.out.println("Substraction"+c);	
	}
	public void mul() {
		int c=a*b;
		System.out.println("Multiplication"+c);	
	}
	public void div() {
		int c=a/b;
		System.out.println("Division"+c);
	}
}