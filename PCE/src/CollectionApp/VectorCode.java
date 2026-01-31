package CollectionApp;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorCode {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		Enumeration el = v.elements();
		while(el.hasMoreElements()) {
		System.out.println(el.nextElement()+" ");
	}
		for(int i=0; i<v.size();i++){
			System.out.println(v);
		}
		for(Object x:v) {
			System.out.println(x);
		}
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		ListIterator lt = v.listIterator(v.size());
		while(lt.hasPrevious()) {
			System.out.println(lt.previous());
		}
	}
}