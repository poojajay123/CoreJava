package javaProgram;

import java.util.Arrays;

public class ArrayCopying {
	public static void main(String[] args) {
		int[] rollnoA =new int[3];
		rollnoA[0] = 4;
		rollnoA[1] = 45;
		rollnoA[2] = 49;

		int[] rollnoB = new int[3];
		for(int i=0; i<rollnoA.length; i++) {
			rollnoB[i] = rollnoA[i];
		}
		System.out.println("input Array is rollnoA : "+ Arrays.toString(rollnoA));
		System.out.println("Output Array is rollnoB : "+ Arrays.toString(rollnoB));
	}
}
