package javaProgram;

public class StringReverse1 {

	public static void main(String[] args) {
String input = "College";
String output = "";
for(int i=6; i>=0; i--) {
	char c1 = input.charAt(i);
	output = output+c1;
	
}
System.out.println(output);
//i=6, c1=e, output=e
//i=5, c1=g, output=e+g
//i=4, c1=e, output=e+g+e
//i=3, c1=l, output=e+g+e+l
//i=2, c1=l, output=e+g+e+l+l
//i=1, c1=o, output=e+g+e+l+l+o
//i=0, c1=o, output=e+g+e+l+l+o+c
	}

}
