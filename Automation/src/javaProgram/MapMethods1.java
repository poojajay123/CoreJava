package javaProgram;

import java.util.HashMap;
import java.util.Map;

public class MapMethods1 {

	public static void main(String[] args) {
		Map<String, Integer> m6 = new HashMap<String, Integer>();
		m6.put("Rice", 50);
		m6.put("Suger", 25);
		m6.put("Jaggery", 3);
		m6.put("Cereals", 25);
		m6.put("ccc", 36);
		System.out.println(m6);
		System.out.println(m6.size());
		System.out.println(m6.containsKey("Rice"));
		System.out.println(m6.containsValue(50));
		System.out.println(m6.replace("Jaggery", 3, 6));
		System.out.println(m6.get("Cereals"));
		//m6.remove("Jaggery");
		//System.out.println(m6);
		m6.replace("Rice", 80);
		System.out.println(m6);
		System.out.println(m6.keySet());
		System.out.println(m6.values());
		System.out.println(m6.entrySet());
		m6.putIfAbsent("ggg", 90);
		System.out.println(m6);
	}

}
