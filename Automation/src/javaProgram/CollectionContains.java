package javaProgram;

import java.util.ArrayList;

public class CollectionContains {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("aa");
		al1.add("bb");
		al1.add("cc");
		System.out.println(al1);
		System.out.println(al1.contains("bb"));
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("aa");
		al2.add("bb");
		al2.add("cc");
		System.out.println(al2);
		;
		System.out.println(al1.containsAll(al2));

	}

}
