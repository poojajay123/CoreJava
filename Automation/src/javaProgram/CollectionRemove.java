package javaProgram;

import java.util.ArrayList;

public class CollectionRemove {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add("aa");
		al1.add("bb");
		al1.add("cc");
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList();
		al2.add("aa");
		al2.add("ee");
		al2.add("dd");
		System.out.println(al2);
		al1.removeAll(al2);//removes all common objects from al1 and al2 
		//and gives remaining object from al1. 
		System.out.println(al1);
		System.out.println(al1.equals(al2));
		System.out.println(al1.get(0));
		
	}

}
