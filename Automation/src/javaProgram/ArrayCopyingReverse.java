package javaProgram;

import java.util.Arrays;

public class ArrayCopyingReverse {

	public static void main(String[] args) {
int[] rollnoA = new int[4];
rollnoA[0] = 24;
rollnoA[1] = 45;
rollnoA[2] = 21;
rollnoA[3] = 67;

int[] rollnoB = new int[4];

for(int i=0, j=rollnoA.length-1; i<rollnoA.length; i++, j--) {
	rollnoB[j] = rollnoA[i];
}
System.out.println("input Array is rollnoA: " + Arrays.toString(rollnoA));
System.out.println("input Array is rollnoB: " + Arrays.toString(rollnoB));

	}

}
