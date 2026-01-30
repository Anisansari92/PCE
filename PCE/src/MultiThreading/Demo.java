package MultiThreading;

public class Demo {

	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		
		t.setName("Anis");
		t.setPriority(7);
		System.out.println(t);
		duty();
	}
	static void duty() {
		Thread t= Thread.currentThread();
		System.out.println(t);
	}
}

 