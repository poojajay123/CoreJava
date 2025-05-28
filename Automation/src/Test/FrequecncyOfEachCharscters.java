package Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequecncyOfEachCharscters {
	public static void main(String[] args) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		String input = "Hello";
		char[] chars = input.toCharArray();
		for(char ch: chars) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}
			else {
				int val = map.get(ch);
				map.put(ch,val+1);
			}
		}
		System.out.println(map);
		for(Map.Entry m: map.entrySet() ) {
			System.out.print(m.getKey() + ":");
			System.out.print(m.getValue() + " ");
		}
	}
}
