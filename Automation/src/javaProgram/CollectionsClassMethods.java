package javaProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsClassMethods {

	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
		num.add(70);
		num.add(40);
		num.add(30);
		num.add(90);
		num.add(10);
		num.add(10);

		System.out.println(num);
		Collections.sort(num);


		int index = Collections.binarySearch(num, 70);
		System.out.println(index);

		System.out.println("Min: " + Collections.min(num));
		System.out.println("Max: " + Collections.max(num));
		System.out.println("Frequency of  10: " + Collections.frequency(num, 10));


		System.out.println(num);
		Collections.reverse(num);
		System.out.println(num);
		Collections.shuffle(num);
		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);

		Collections.rotate(num, -2);
		System.out.println(num);
	}

}
