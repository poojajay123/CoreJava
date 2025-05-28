package javaProgram;

import java.util.Arrays;

public class ArrayCopying1 {

	public static void main(String[] args) {
		int[] A = new int[4];
		A[0]= 12;
		A[1] =34;
		A[2] =45;
		A[3] =56;

		int[] B= new int[4];
		for(int i=0; i<A.length; i++) {
			B[i]=A[i];
		}
		System.out.println("A[i]: " + Arrays.toString(A));
		System.out.println("B[i]: " + Arrays.toString(B));

	}

}
