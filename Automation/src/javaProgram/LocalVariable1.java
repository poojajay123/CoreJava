package javaProgram;

public class LocalVariable1 {
	int a = 10;
	int b= 20;
	static void add() {
		LocalVariable1 c1 = new LocalVariable1();
		System.out.println(c1.a + c1.b);
	}
	static void sub() {
		LocalVariable1 c2 = new LocalVariable1();
		System.out.println(c2.a - c2.b);
	}
	public static void main(String[] args) {
		LocalVariable1.sub();
		LocalVariable1.add();

	}

}
