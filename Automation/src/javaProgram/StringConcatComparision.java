package javaProgram;

public class StringConcatComparision {

	public static void main(String[] args) {
		String s1 ="JAVA";
		String s2 = "PYTHON";
		String s3 = "JAVA"+"PYTHON";
		String s4 = "JAVA"+"PYTHON";
		String s5 = new String("JAVA");
		String s6 = new String("PYTHON");

		if(s3==s4) {
			System.out.println("referances are equal.");
		}
		else {
			System.out.println("referances are not equal.");
		}
		if(s5==s6) {
			System.out.println("Referances s5 and s6 are Equal.");
		}
		else {
			System.out.println("Referances s5 and s6 are not Equal.");
		}
	}

}
