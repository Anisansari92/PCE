package ToStringApp;

public class ComapreTo {

	public static void main(String[] args) {
		String s1 ="SACHIN";
		String s2 ="SAURAV";
		
		int ann=s1.compareTo(s2);
		System.out.println(ann);
		
		if(ann>0) {
			System.out.println("S1 is greater");
		}
		else {
			System.out.println("S2 is lower");
		}
	}
}