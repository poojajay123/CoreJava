package javaProgram;

public class StringComparisionByEquals1 {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("Java");
		//String s1="java";
		//String s2="JAVA";
	
		if(s1.equals(s2)==true) {
			System.out.println("String referances are equal");
		}
		else {
			System.out.println("String referances are not equal");
		}
			}
	}


