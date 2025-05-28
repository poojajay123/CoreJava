package javaProgram;

public class StringReferancesComparision {

	public static void main(String[] args) {
		//String s1 = "JAVA";
		//String s2 = "PYTHON";
		//String s3 = s1+s2;
		//String s4 = s1+s2;
		String s1 = new String("JAVA");
		String s2 = new String("PYTHON");
		String s3 = s1+s2;
		String s4 = s1+s2;
		if(s3==s4) {
			System.out.println("String referances are equal");
		}
		else {
			System.out.println("String referances are not equal");
		}
	}

}
//as here values are not getting added but referances are, beacause s1 and s2 are not literals.
//And duplication is possible in non-constant pool, therefore referances are not same.