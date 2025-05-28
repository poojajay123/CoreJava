package javaProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassMethods1 {

	public static void main(String[] args) {

		List<String> source =Arrays.asList("Java", "Python", "C++", "JavaScript");

		List<String> dest =Arrays.asList("Java Programming", "Python Programming", "C++ Programming", "JavaScript Programming");

		//replaces all occurances of a specific element with a new value
		Collections.replaceAll(source, "Java", "Ruby");
		System.out.println("Source After Replace All: " + source);

		//copy elements of source to destination element
		Collections.copy(dest, source);
		System.out.println("Destination after copy " + dest);

		//replaces all elements in a list with given object 
		Collections.fill(source, "Unknown");
		System.out.println("List after Fill: " + source);

		//Return true if no common elements
		boolean b = Collections.disjoint(source, dest);
		System.out.println("Source After disjoint: " + b);
	}

}
