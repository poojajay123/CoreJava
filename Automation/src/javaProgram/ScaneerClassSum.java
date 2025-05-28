package javaProgram;

import java.util.Scanner;

public class ScaneerClassSum {
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	int a = s1.nextInt();
	int b = s1.nextInt();
	int sum =a+b;
	System.out.println("Sum of a and b is : " +sum);
	s1.close();
}
}
