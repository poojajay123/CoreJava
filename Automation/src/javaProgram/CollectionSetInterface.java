package javaProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionSetInterface {

	public static void main(String[] args) {
		Set m7 = new LinkedHashSet();
		m7.add(12);
		m7.add("Hello");
		m7.add('c');
		m7.add(3.7f);
		m7.add(true);
		m7.add(null);
		m7.add(null);

		m7.add(3.55);
		System.out.println(m7);

		Set m8 = new LinkedHashSet();
		m8.add("hello");
		m8.add('u');
		m8.add('c');
		System.out.println(m8);


		m7.addAll(m8);
		System.out.println(m7);
		m8.clear();
		System.out.println(m7);
		System.out.println(m8);
		m7.removeAll(m8);
		System.out.println(m7);
		System.out.println(m7.remove(12));


		boolean b = m7.contains(12);
		System.out.println(b);
		boolean b1 = m7.containsAll(m8);
		System.out.println(b1);
		System.out.println(m8.isEmpty());
		System.out.println(m7);

		Iterator i2 = m7.iterator();
		System.out.println("The m7 collection values are: ");
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		//m7.retainAll(m8);//common elements from both
		//System.out.println(m7);
		System.out.println(m7.size());
		System.out.println(m7.equals(m8));

	}

}
