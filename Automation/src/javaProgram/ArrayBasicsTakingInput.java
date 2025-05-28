package javaProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasicsTakingInput {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter the size of array: ");
int [] rollNo = new int[s.nextInt()];
for(int i=0; i<=3; i++) {
	System.out.println("Enter the rollNo at index position: " +i);
	rollNo[i] = s.nextInt();
}
s.close();
System.out.println("the Array output is: ");
System.out.println(Arrays.toString(rollNo));

	}

}
