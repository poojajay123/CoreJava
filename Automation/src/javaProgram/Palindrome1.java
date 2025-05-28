package javaProgram;

public class Palindrome1 {
	public static void main(String[] args) {
		String input= "rotator";
		String output= "";
		for(int i=6; i>=0; i--) {
			char c =input.charAt(i);
			output = output+c;
		}
			System.out.println("Input: " +input);
			System.out.println("Output: " +output);


			if(output.equals(input)) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not Palindrome");
			}
				
			}
		}
	


