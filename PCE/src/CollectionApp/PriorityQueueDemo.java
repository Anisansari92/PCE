package CollectionApp;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		
		System.out.println(pq);
		
		for(int i=0; i<pq.size(); i++) {
			System.out.println(pq);
		}
		
		for(Object x:pq) {
			System.out.println(x);
		}
		
//		Iterator it = pq.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.Next());
//		}
//		
//		ListIterator lt = pq.listIterator(pq.size());
//		while(lt.hasPrevious()) {
//			System.out.println(lt.Previous());
//		}
//		
//		Enumeration e = pq.element();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
	}
}