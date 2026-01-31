package CollectionApp;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CarryonApp {

	public static void main(String[] args) {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		
		Iterator its =al.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
	}

}
