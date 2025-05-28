package java_assignments;

import java.util.ArrayList;

public class TwoArrayListintoSingleArrayList {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("cherry");

		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("pear");
		list1.add("strawberry");
		list1.add("Wtermelon");

		//join the list
		ArrayList<String> joinedList = new ArrayList<String>(list1);
		joinedList.addAll(list2);

		System.out.println("Joined ArrayList: "+ joinedList);

	}

}
