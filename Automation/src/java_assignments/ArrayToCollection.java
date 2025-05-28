package java_assignments;

import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) {
String[] array = {"Apple", "Mango", "Strawberry", "Banana", "Cherry"};

List<String> li = Arrays.asList(array);
System.out.println("Converted List: " + li);
	}

}
