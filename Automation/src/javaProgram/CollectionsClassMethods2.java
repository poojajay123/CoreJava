package javaProgram;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionsClassMethods2 {

	public static void main(String[] args) {
Map <Integer, String> modifiebleMap = new HashMap<>();
modifiebleMap.put(1, "Java");
modifiebleMap.put(2, "Python");
modifiebleMap.put(3, "C++");
modifiebleMap.put(4, "Ruby");

Map<Integer, String> unmodifiebleMap = Collections.unmodifiableMap(modifiebleMap);
System.out.println(unmodifiebleMap);

unmodifiebleMap.put(5, "C");
System.out.println(unmodifiebleMap);
//it gives Exception in "main" java.lang.UnsupportedOperationException 
	}

}
