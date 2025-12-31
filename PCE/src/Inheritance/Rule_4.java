package Inheritance;

public class Rule_4 {
	public static void main(String[] args)
	{
		Def c = new Def();
		System.out.println(c.a);
		System.out.println(c.b);		
	}
}

class Grandparent

	{
		int a= 10;
	}

class ABc extends Grandparent
{
	
		int b=20;
	
}
class Def extends ABc
{
	
}