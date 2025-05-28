package javaProgram;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		try {
			int [] rollNo = new int[s.nextInt()];
			for(int i=0; i<3; i++) {
				System.out.println("Enter the rollNo at index position: " +i);
				rollNo[i] = s.nextInt();
			}
			s.close();
			System.out.println("the Array output is: ");
			System.out.println(Arrays.toString(rollNo));
		}
		catch(NegativeArraySizeException n) {
			System.out.println("The size of Array can never be negative");
			System.out.println("Please Enter the positive Value");
		}
		catch(InputMismatchException n1) {
			System.out.println("The size of Array can never be String");
			System.out.println("Please Enter the positive Value");
		}
	}

}
