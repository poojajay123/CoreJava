package java_assignments;

import java.util.ArrayList;

public class CollectionaddAll {
	public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(100);
	al.add(200);
	al.add(300);
	System.out.println(al);
	
	ArrayList al1 = new ArrayList();
	al1.add("aa");
	al1.add("bb");
	al1.add("cc");
	System.out.println(al1);
	
	al.addAll(al1);
	System.out.println(al);
	}	
}
