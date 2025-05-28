package javaProgram;

public class LocalGlobalVariable {
	int globalVar = 50;
	public void display() {
		int localVar = 10;
		System.out.println("Local Variable: " + localVar);
		System.out.println("global Variable: " + globalVar);

	}
	public static void main(String[] args) {
		LocalGlobalVariable obj = new LocalGlobalVariable();
		obj.display();
	}
}
