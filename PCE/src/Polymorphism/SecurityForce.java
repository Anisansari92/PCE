package Polymorphism;

public class SecurityForce {
	public static void main(String[] args)
	{
		duty(new Army());
		System.out.println("-----------------");
		
		duty(new Neavy());
		System.out.println("-----------------");
		
		duty(new Airforce());
		System.out.println("-----------------");

	}
	static void duty(Security s) {
		s.Job();
		s.Protect();
	}
}

class Security
{
	void Job() {
		System.out.println("To earn some money0");
	}
	void Protect() {
		System.out.println("To protect people from enemy");
	}
}

class Army extends Security
{
	void Tank() {
		System.out.println("With the help Tank");
	}
}

class Neavy extends Security
{
	void Ship() {
		System.out.println("With the help Ship");
	}
}

class Airforce extends Security
{
	void Jet() {
		System.out.println("With the help Jet");
	}
}