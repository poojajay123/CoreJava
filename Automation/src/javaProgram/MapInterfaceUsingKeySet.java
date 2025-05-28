package javaProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapInterfaceUsingKeySet {

	public static void main(String[] args) {
Map<String, Integer> m1 = new TreeMap<String, Integer>();
m1.put("Rice", 10);
m1.put("Suger", 2);
m1.put("Jaggery", 3);
m1.put("Cereals", 25);
//m1.put(null, null);
//m1.put(null, null);

System.out.println(m1);

for(String key: m1.keySet()) {
	System.out.println("Keys: "+ key);
}
for(Integer value: m1.values()) {
	System.out.println("Values: "+ value);
}
for(Entry<String, Integer> EntrySet: m1.entrySet()) {
	System.out.println("EntrySet Key and Value: "+ EntrySet);
}


	}

}
