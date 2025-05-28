package java_assignments;

import java.util.Scanner;

public class ScannerClassRectangle {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the length of Rectangle: ");
			Double l = s.nextDouble();
			System.out.println("Enter the Width of Rectangle: ");
			double w = s.nextDouble();
			double Area = l*w;
			double Circumference = 2*(l+w);
			System.out.println("Area of Rectangle is: " + Area);
			System.out.println("Circumference of Rectangle is: " + Circumference);
			s.close();

		}

	}


