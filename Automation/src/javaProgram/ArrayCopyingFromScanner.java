package javaProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyingFromScanner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int [] rollNo1 = new int[s.nextInt()];
		int [] rollNo2 = new int[s.nextInt()];

		for(int i=0, j= rollNo1.length-1; i<rollNo1.length; i++, j--) {
			System.out.println("Enter the rollNo at index position: " +i);
			rollNo1[i] = s.nextInt();
			rollNo2[j] = rollNo1[i];
		}
		s.close();
System.out.println(Arrays.toString(rollNo1));
System.out.println(Arrays.toString(rollNo2));

	}

}
