package Polymorphism;

public class TendulkarApp {
	public static void main(String[] args)
	{
		Tendulkar t=new ArjunTendulkar();
		t.Job();
		t.Profession();
		((ArjunTendulkar)t).Smoker();
	}
}

class Tendulkar{
	void Job() {
		System.out.println("Play Cricket");
	}
	void Profession() {
		System.out.println("He is an Batsman");
	}
}

class ArjunTendulkar extends Tendulkar{
	void Profession() {
		System.out.println("He is Bowler");
	}
	void Smoker() {
		System.out.println("He smoke sometime");
	}
}