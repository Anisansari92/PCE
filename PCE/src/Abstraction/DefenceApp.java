package Abstraction;

public class DefenceApp {
	public static void main(String[] args)
	{
		disp(new Neavy());
			System.out.println("------------");
		disp(new Army());
			System.out.println("------------");
		disp(new Airforce());
			System.out.println("------------");
			
	}
	static void disp(SecurityForce sf) {
	sf.Protect();
	//((Airforce)(sf)).Jet();
	}
}

abstract class SecurityForce{
	abstract void Protect();
}

class Neavy  extends SecurityForce
{
	void Ship()
	{
		System.out.println("Use Ship");
	}
	void Protect()
	{
		System.out.println("To protect seaways");
	}
}

class Army extends SecurityForce
{
	void Tank(){
	System.out.println("Use tank");
	}
	void Protect()
	{
		System.out.println("To protect land");
	}
}
class Airforce extends SecurityForce
{
	void Jet() {
		System.out.println("Use Jet");
	}
	void Protect()
	{
		System.out.println("To protect air ways");
	}
}
