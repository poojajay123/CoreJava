package javaProgram;

public class Palindrome {
public static void main(String[] args) {
	String  input = "rotator";
	String output = "";
	
	for(int i=6; i>=0; i--) {
		char c1 = input.charAt(i);
		output= output+c1;
	}
	System.out.println("This is ->" +input);
	System.out.println("This is ->" +output);
	if(input.equals(output)) {
		System.out.println("They are Palindrome");
	}
	else {
		System.out.println("They are not Palindrome");
	}
}
}
