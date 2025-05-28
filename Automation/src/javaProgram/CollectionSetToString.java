package javaProgram;

import java.util.HashSet;
import java.util.Set;

public class CollectionSetToString {

	public static void main(String[] args) {
		Set m0 = new HashSet();
		m0.add(12);
		m0.add("Hello");
		m0.add('c');
		m0.add(3.7f);
		m0.add(true);
		m0.add(null);
		m0.add(3.55);
		System.out.println(m0);
		System.out.println(m0.toString());
	}

}
