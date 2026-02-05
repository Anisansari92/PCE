package ToStringApp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CompareReverseDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		System.out.println(al);
		Comparator r= Collections.reverseOrder();
		Collections.sort(al,r);
		System.out.println(al);
ll	}
}
