package javaProgram;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionProperty1 {

	public static void main(String[] args) {


		Collection<String> c1 = new ArrayList<String>();
		c1.add("MKT");
		c1.add("Manasa");
		c1.add("padma");
		c1.add("Anand");
		c1.add("Pavan");
		System.out.println(c1);
		Collection<Integer> c2 = new ArrayList<Integer>();
		c2.add(74);
		c2.add(85);
		c2.add(96);
		c2.add(52);
		c2.add(85);
		System.out.println(c2);

		Collection<Boolean> c3= new ArrayList<Boolean>();
		c3.add(true);
		System.out.println(c3);
	}

}
