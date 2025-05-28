package javaProgram;

import java.util.Scanner;

public class ScannerClassCircle{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		double r = s.nextDouble();
		double Area = Math.PI*r*r;
		double Circumference = 2*Math.PI*r;
		System.out.println("Area of Circle is: " + Area);
		System.out.println("Circumference of Circle is: " + Circumference);

		s.close();
	}
}
