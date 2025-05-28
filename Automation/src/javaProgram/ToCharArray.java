package javaProgram;

import java.util.Arrays;

public class ToCharArray {

	public static void main(String[] args) {
		int[] rollnoA = new int[5];
		rollnoA[0] = 4;
		rollnoA[1] = 14;
		rollnoA[2] = 46;
		rollnoA[3] = 45;
		rollnoA[4] = 40;
		System.out.println(Arrays.toString(rollnoA));

		String name ="Ajay";
		char[] c= name.toCharArray();
		System.out.println(c);
		System.out.println(Arrays.toString(c));


	}

}
