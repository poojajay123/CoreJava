package java_assignments;

import java.util.Scanner;

public class ScannerClassTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base of Triangle: ");
		Double b = s.nextDouble();
		System.out.println("Enter the hight of Triangle: ");
		Double h = s.nextDouble();
		double Area = b*h;
		double Circumference = 0.5*b*h;
		System.out.println("Area of Triangle is: " + Area);
		System.out.println("Circumference of Triangle is: " + Circumference);
		s.close();

	}

}
