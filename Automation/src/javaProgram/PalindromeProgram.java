package javaProgram;

public class PalindromeProgram {

	public static void main(String[] args) {
String s1="78987";
String s2 = "";
for(int i=4; i>=0; i--) {
	char c= s1.charAt(i);
	s2=s2+c;
	System.out.println(s2);
}
	if(s1.equals(s2)==true) {
	System.out.println("They are Palindrome");
	}else {
	System.out.println("They are not Palindrome");
	}
}
	}

