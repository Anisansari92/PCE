package Inheritance;

public class Rule_3
{
	public static void main(String[] args)
	{
		Childs c = new Childs();
	}
}

class Parents
{
	public Parents() {
	System.out.println("This is parent constructur");
}
}
class Childs extends Parents
{
	public Childs()
	{
	System.out.println("This is child constructur");
	}
}