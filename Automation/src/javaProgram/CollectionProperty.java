package javaProgram;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionProperty {

	public static void main(String[] args) {
		Collection c1= new ArrayList();
		c1.add("MKT");
		c1.add(8577);
		c1.add(85.36);
		c1.add('M');
		c1.add(true);
		System.out.println(c1);

		//        c1.clear();
		//        System.out.println("After Clear-> "+c1);
		//        System.out.println(c1.isEmpty());

		Collection c2= new ArrayList();
		c2.add("Akash");
		c2.add(7458);
		c2.add(65);
		c2.add('A');
		c2.add(false);
		System.out.println(c2);
		c2.addAll(c1);
		System.out.println(c2);
		System.out.println(c2.contains("Jyoti"));
		System.out.println(c2.containsAll(c1));
		c2.remove('M');
		System.out.println("Upcated c2->"+ c2);
		c2.removeAll(c1);
		System.out.println("Upcated c2->"+ c2);
		boolean b1=        c2.equals(c1);
		System.out.println(b1);

	}


}

