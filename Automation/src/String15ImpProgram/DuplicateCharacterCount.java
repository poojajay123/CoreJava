package String15ImpProgram;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterCount {

	public static void main(String[] args) {
String input = "Programming";
char[] chars = input.toCharArray();//convert to char array
//Map to store character counts
Map<Character, Integer> charCount = new HashMap<>();
//count each character
for(char c: chars) {
	charCount.put(c,  charCount.getOrDefault(c, 0) + 1);
	//print characters with count>1
	System.out.println("Duplicate characters: ");
	for(Map.Entry<Character, Integer>entry: charCount.entrySet()) {
		if(entry.getValue()>=1) {
		System.out.println(entry.getKey() + " : " + entry.getValue() );
	}
}
	}
}
}
