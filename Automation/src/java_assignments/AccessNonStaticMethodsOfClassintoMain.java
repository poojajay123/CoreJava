package java_assignments;

public class AccessNonStaticMethodsOfClassintoMain {
	public void display() {
		System.out.println("This is Non-Static Method");
	}
	public static void main(String[] args) {
		AccessNonStaticMethodsOfClassintoMain obj = new AccessNonStaticMethodsOfClassintoMain();
		obj.display();
	}
}
