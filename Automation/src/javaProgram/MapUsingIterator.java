package javaProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapUsingIterator {

	public static void main(String[] args) {
		Map<String, String> m2 = new HashMap<String, String>();
m2.put("INR", "Indian Rupee");
m2.put("USD", "US Dollers");
m2.put("CAD", "Canadian Dollers");
m2.put("GBP", "United Kingdom Pound");
for(String key: m2.keySet()) {
	System.out.println(key);
}
for(String value: m2.values()) {
	System.out.println(value);
}

Iterator<Entry<String, String>> i1 = m2.entrySet().iterator();
while(i1.hasNext()) {
	System.out.println(i1.next());
}
	}

}
