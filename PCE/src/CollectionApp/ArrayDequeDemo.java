package CollectionApp;

import java.util.ArrayDeque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		System.out.println(ad);
	
	for(int i=0; i<ad.size();i++) {
		System.out.println(ad);
	}
	for(Object x:ad) {
		System.out.println(x);
	}
	Iterator it = ad.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//	ListIterator lt = ad.listIterator(ad.size());
//		while(lt.hasPrevious()) {
//			System.out.println(lt.previous());
//		}
//	Enumeration e = ad.element();
//	while(e.hasMoreElements()){
//		System.out.println(el.nextElement());
//	}
} 
}
