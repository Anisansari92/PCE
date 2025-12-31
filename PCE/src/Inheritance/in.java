package Inheritance;

public class in {
	public static void main(String[] args)
	{
		Army army = new Army();
		army.Job();
		army.Protect();
		army.Tank();
		System.out.println("------");
		
		Neavy neavy = new Neavy();
		neavy.Job();
		neavy.Protect();
		neavy.Ship();
		System.out.println("------------");
		
		Airforce air = new Airforce();
		air.Job();
		air.Protect();
		air.Jet();
		System.out.println("---------------");	
	}
}

class Securityforce
{
	void Job() {
		System.out.println("To earn some money0");
	}
	void Protect() {
		System.out.println("To protect people from enemy");
	}
}

class Army extends Securityforce
{
	void Tank() {
		System.out.println("With the help Tank");
	}
}

class Neavy extends Securityforce
{
	void Ship() {
		System.out.println("With the help Ship");
	}
}

class Airforce extends Securityforce
{
	void Jet() {
		System.out.println("With the help Jet");
	}
}