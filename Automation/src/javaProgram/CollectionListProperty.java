package javaProgram;

import java.util.ArrayList;
import java.util.List;

public class CollectionListProperty {

	public static void main(String[] args) {
List<String> l1 = new ArrayList<String>();
l1.add("Pooja");
l1.add("Poornima");
l1.add("Naresh");
l1.add("Rajitha");
l1.add("Rahi");
l1.add("Pooja");
l1.remove(2);
//l1.add("Pooja");
//l1.add(null);
l1.add(null);
System.out.println(l1);

List<String> l2 = new ArrayList<String>();
l2.add("Jyoti");
l2.add("Manasa");
l2.add("Priya");
//l2.addAll(l1);
l2.addAll(0, l1);
System.out.println(l2);
System.out.println(l2.get(1));
System.out.println(l2);


	}

}
