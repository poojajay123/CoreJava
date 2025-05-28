package javaProgram;

public class MethodsOverloading {
	void login(int a) {
		System.out.println("Enter Integer value");
	}
	void login(String s) {
		System.out.println("Enter String value");
	}
	void login(char c) {
		System.out.println("Enter Char value");
	}
	public static void main(String[] args) {
		MethodsOverloading m1 = new MethodsOverloading();
		m1.login(5);
		m1.login("Pooja");
		m1.login('c');
	}
}
