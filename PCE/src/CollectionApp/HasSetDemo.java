package CollectionApp;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HasSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		System.out.println(hs);
		
		for(int i=0; i<hs.size(); i++) {
			System.out.println(hs);
		}
		
		for(Object x:hs) {
			System.out.println(x);
		}
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		ListIterator lt = hs.listIterator(hs.size());
//		while(hs.hasPrevious()) {
//			System.out.println(hs.previous);
//		}
//		
//		Enumeration e =hs.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement()+" ");
//		}
	}
}
