package javaProgram;
public class MethodOverloading1 {

	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	double add(double a, double b) {
		return a+b;
	}


	public static void main(String[] args) {
		MethodOverloading1 cal = new MethodOverloading1();
		System.out.println(cal.add(5,9));
		System.out.println(cal.add(8,9,12));
		System.out.println(cal.add(8.5,12.9));
	}

}


