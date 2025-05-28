package javaProgram;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		String s1= "SILENT";
		String s2= "LISTEN";
		if(s1.length()!=s2.length()) {
			System.out.println("Strings are not Anagram");
		}else {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			if(Arrays.equals(c1, c2)){
				System.out.println("Strings are Anagram");
			}
			else {
				System.out.println("Strings are not Anagram");
			}
			
		}
	}
}



