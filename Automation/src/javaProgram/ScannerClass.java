package javaProgram;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);/*giving CTE(compile time execution because there are 
no non parameterized constructors present in scanner class
		 */
		String input = s1.next();//String values
		int a = s1.nextInt();
		byte b = s1.nextByte();
		short s = s1.nextShort();
		long l = s1.nextLong();
		float f = s1.nextFloat();
		boolean b1 = s1.nextBoolean();
		double d = s1.nextDouble();
	}

}
