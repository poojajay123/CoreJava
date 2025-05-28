package javaProgram;

public class StringReferanceComparision {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2;
		s2=s1;
		
		if(s1.equals(s2)==true) {
			System.out.println("String referances are equal");
		}
		else {
			System.out.println("String referances are not equal");
		}
			}
	}


