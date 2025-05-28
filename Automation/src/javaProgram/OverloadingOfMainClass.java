package javaProgram;

public class OverloadingOfMainClass {
	

	public static void main(String[] args) {
		System.out.println("main-0");
	
		main(2);
		main(2,3);
		main(2,'c');
		main(args);
	}
	public static void main(int a) {
		System.out.println("main-1");
	}
	public static void main(int a, int b) {
		System.out.println("main-2");
	}
	public static void main(int a, char c) {
		System.out.println("main-3");
	}
}
