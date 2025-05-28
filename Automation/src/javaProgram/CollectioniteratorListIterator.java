package javaProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectioniteratorListIterator {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("Pooja");
		l1.add("Poornima");
		l1.add("Naresh");
		l1.add("Rajitha");
		l1.add("Rahi");
		System.out.println(l1);

		Iterator<String> i1 = l1.iterator();
		//hasnext and next
		//hasnext- boolean= wheather the next element is present or not?
		//next-object= gives u that element
		System.out.println("Iteration using Iterator(I)");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("Iteration Using ListIterator (I)");
		ListIterator<String> i2 = l1.listIterator();
		//hasnext and next
		//hasnext- boolean= wheather the next element is present or not?
		//next-object= gives u that next element
		//hasprevious- boolean= wheather the previous element is present or not?
		//previous- object= gives u previous element
		System.out.println("using next method: ");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("using previous method");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	}
}
