package java_assignments;

public class AccessNonStaticVariableintoStaticMethod {
int a = 100;
int b = 200;
 static void add(int a, int b) {
	System.out.println("addition of a and b: " + (a+b));
 }
	public static void main(String[] args) {
		AccessNonStaticVariableintoStaticMethod.add(100,200);
	}

}
