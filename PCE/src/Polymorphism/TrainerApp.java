package Polymorphism;

public class TrainerApp {
	public static void main(String[] args)
	{
		duty(new Java());
		System.out.println("----------------");
		duty(new Python());
		System.out.println("----------------");
		duty(new Aptitude());
		System.out.println("----------------");
	}
	static void duty(Trainer t) {
		t.Teach();
	}
}

class Trainer
{
	void Teach()
	{
		System.out.println("Teaching Language");
	}
}

class Java extends Trainer
{
	void Teach()
	{
		System.out.println("Learn Java");
	}
}

class Python extends Trainer
{
	void Teach()
	{
		System.out.println("Learn Python");
	}
}

class Aptitude extends Trainer 
{
	void Teach()
	{
		System.out.println("Learn something new");
	}
}