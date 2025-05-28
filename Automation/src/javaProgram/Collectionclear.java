package javaProgram;

import java.util.ArrayList;

public class Collectionclear {

	public static void main(String[] args) {

	ArrayList al = new ArrayList();
	al.add(100);
	al.add(200);
	al.add(300);
	System.out.println(al);
	
	

	
	al.clear();
	System.out.println("After clearing data al: " + al);
	}
}
