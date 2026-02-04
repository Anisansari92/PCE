package CollectionApp;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll =new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll);
		}
		
		for(Object x:ll) {
			System.out.println(x);
		}
		
//		Iterator it = ll.iterator();
//		while(ll.hasNext()) {
//			System.out.println(ll.next());
//		}
//		
//		ListIterator lt = ll.listIterator();
//		while(ll.hasPrevious()) {
//			System.out.println(ll.Previous());
//		}
//		
//		Enumeration e = ll.element();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
		
	}

}
