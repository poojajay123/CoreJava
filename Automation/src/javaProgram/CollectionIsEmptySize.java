package javaProgram;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionIsEmptySize {

	public static void main(String[] args) {
		Collection al1 = new ArrayList();
		al1.add("aa");
		al1.add("bb");
		al1.add("cc");
		System.out.println(al1);
		System.out.println(al1.isEmpty());
		System.out.println(al1.size());
	}

}
