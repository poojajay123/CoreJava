package javaProgram;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchArray1 {
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
			Scanner s1 = new Scanner(System.in);

			System.out.println("Enter the Size of Array: ");
			int [] rollNo = new int[s1.nextInt()];
			for(int i=0; i<=3; i++) {
				System.out.println("Enter the rollNo at index position: " +i);
				rollNo[i] = s1.nextInt();
			}
			s1.close();
			System.out.println("the Array output is: ");
			System.out.println(Arrays.toString(rollNo));
		}

		catch(InputMismatchException n1) {
			System.out.println("The size of Array can never be String");
			System.out.println("Please Enter the positive Value");
			Scanner s2 = new Scanner(System.in);

			System.out.println("Enter the Size of Array: ");
			int [] rollNo = new int[s2.nextInt()];
			for(int i=0; i<=3; i++) {
				System.out.println("Enter the rollNo at index position: " +i);
				rollNo[i] = s2.nextInt();
			}
			s2.close();
			System.out.println("the Array output is: ");
			System.out.println(Arrays.toString(rollNo));
		}
	}
}
