package java_assignments;

public class AssertDemo {
	public static void main(String[] args) {
		int age = 16;
		assert age > 0 : "Age is positive number";
		System.out.println("Age is positive number: " + age);

	}
}
//It is use to check condition 
//if condition is true it verifies the condition
//if condition is false is throws assertion error