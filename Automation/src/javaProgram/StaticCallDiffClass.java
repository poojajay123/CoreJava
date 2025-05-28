package javaProgram;

	class Example{
		
	static void display() {
		System.out.println("Print display method");
	}
	}
	public class StaticCallDiffClass {

	public static void main(String[] args) {
		Example.display();
		StaticCall.display();
		
	}

}
