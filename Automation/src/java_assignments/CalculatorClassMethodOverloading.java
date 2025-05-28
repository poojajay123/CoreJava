package java_assignments;

public class CalculatorClassMethodOverloading {

public void add(int a, int b) {
	System.out.println("Addition of a and b: " + (a+b));
}
public  void add(int a, int b, int c) {
	System.out.println("Addition of a, b and c: "+ (a+b+c));
}
public void sub(int a, int b) {
	System.out.println("Substraction of a and b: " + (a-b));
}
public static void main(String[] args) {
	CalculatorClassMethodOverloading cal = new CalculatorClassMethodOverloading();
	cal.add(50, 20);
	cal.add(50,20,70);
	cal.sub(50, 20);
	}

}
