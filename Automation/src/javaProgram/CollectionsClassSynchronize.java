package javaProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassSynchronize {

	public static void main(String[] args) {
List<String> list = new ArrayList<String>();
//create synchronized version of list
List<String> syncList = Collections.synchronizedList(list);
//always synchronize on the list when iterating
synchronized(syncList) {
	syncList.add("Apple");
	syncList.add("Banana");
	syncList.add("cherry");
	syncList.add("Strawberry");
	for(String item: syncList) {
		System.out.println(item);
	}
}
	}

}
