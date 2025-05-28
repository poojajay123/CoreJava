package javaProgram;

import java.util.Arrays;

public class ArrayCopyingReverse1 {

	public static void main(String[] args) {
		int[] A= new int[5];
		A[0] =12;
		A[1] =13;
		A[2] =14;
		A[3] =15;
		A[4] =56;

		int B[] = new int[5];
		for(int i=0,j=A.length-1; i<A.length; i++,j--) {
			B[i]= A[j];
		}
		System.out.println("A[i]: " + Arrays.toString(A));
		System.out.println("B[j]: " + Arrays.toString(B));
	}

}
