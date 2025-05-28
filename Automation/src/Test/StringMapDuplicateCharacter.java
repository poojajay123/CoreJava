package Test;

import java.util.HashMap;
import java.util.Map;

public class StringMapDuplicateCharacter {
	public static void findDuplicates(String str) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		map.forEach((k, v) -> {
			if(v > 1)
				System.out.println(k + " : " + v);
		});
}
		public static void main(String[] args) {


		findDuplicates("Hello");
		}
}
