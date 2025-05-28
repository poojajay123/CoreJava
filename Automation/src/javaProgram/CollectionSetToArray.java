package javaProgram;

import java.util.HashSet;
import java.util.Set;

public class CollectionSetToArray {

	public static void main(String[] args) {
		Set m9 = new HashSet();
		m9.add(12);
		m9.add("Hello");
		m9.add('c');
		m9.add(3.7f);
		m9.add(true);
		m9.add(null);
		m9.add(3.55);
		System.out.println(m9);
		Object a2[] = m9.toArray();
				System.out.println("The List of Elements are: ");
				for(int i=0; i<=a2.length-1; i++) {
					System.out.println(a2[i]);
				}
		
	}

}
