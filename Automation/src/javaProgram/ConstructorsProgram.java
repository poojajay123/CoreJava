package javaProgram;

public class ConstructorsProgram {
	//only public, protected & private are permitted
	public void Constructor() {
		System.out.println("constructor Example");// ctrl+space
	}
	public void Constructor(int a) {
		System.out.println("constructor Example with parameter");// ctrl+space
	}
public static void main(String[] args) {
	ConstructorsProgram c1 = new ConstructorsProgram();
	c1.Constructor();
	c1.Constructor(5);
}
}
