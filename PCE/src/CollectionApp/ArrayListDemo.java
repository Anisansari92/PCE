package CollectionApp;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("10");
		al.add("20");
		al.add("30");
		al.add("40");
		al.add("50");
		
		System.out.println(al);
	for(int i=0; i<al.size();i++){
		System.out.println(al);
	}
	for(Object x:al) {
		System.out.println(x);
	}
	Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
	}
//	ListIterator lt = al.listIterator(al.size());
//		While(lt.hasPrevious()){
//			System.out.println(lt.previous());
//	}
//		
//	Enumeration el = al.elements();
//		while(el.hasMoreElements()) {
//		System.out.println(el.nextElement()+" ");
	}
}

