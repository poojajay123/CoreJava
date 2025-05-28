package PracticeProgram;

public class Palindrom {

	public static void main(String[] args) {
		String s1 = "RADAR";
		String s2 = "";
		for(int i=4; i>=0; i--) {
			char c = s1.charAt(i);
			s2=s2+c;
			System.out.println(s2);
			}
		System.out.println("String before reversing: " +s1);
		System.out.println("String after reversing: " +s2);

			if(s2.equals(s1)) {
				System.out.println("It is Palindrome");
			}else {
				System.out.println("It is not Palindrome");
			}
		}
	}


