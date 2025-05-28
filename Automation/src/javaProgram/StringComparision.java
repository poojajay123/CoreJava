package javaProgram;

public class StringComparision {

	public static void main(String[] args) {
String s1 = new String("Java");
String s2 = new String("Java");
//String s1 ="Java";
//String s2 ="Java";
//s1=s2;
if(s1==s2) {
	System.out.println("String referances are equal");
}
else {
	System.out.println("String referances are not equal");
}
	}

}
//wherever new keyword is used to create string. it gets created in non-constant pool and
//when == opertator used to compare two string it referances are compared and not the values.
//and s1 has different referance than s2 we get the o/p as referances are not equal.
