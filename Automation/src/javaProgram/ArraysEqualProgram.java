package javaProgram;

import java.util.Arrays;

public class ArraysEqualProgram {

	public static void main(String[] args) {
		int[] rollNo = new int[4];
		rollNo[0] = 15;
		rollNo[1] = 34;
		rollNo[2] = 32;
		rollNo[3] = 30;

		int[] rollNo1 = new int[4];
		rollNo1[0] = 15;
		rollNo1[1] = 34;
		rollNo1[2] = 32;
		rollNo1[3] = 30;

		boolean b = Arrays.equals(rollNo, rollNo1);
		if(b== true) {
			System.out.println("The given Arrays are Equal");
		}
		else {
			System.out.println("The given arrays are not equal");
		}


	}

}
