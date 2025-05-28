package javaProgram;
public class Typecasting_NarrowingRangeOverflow {
	public static void main(String[] args) {
		double pi_pow=Math.pow(Math.PI, 10);
		float pi_f=(float) pi_pow;  
		long pi_l=(long) pi_pow;
		int pi_i=(int) pi_pow;
		short pi_s=(short) pi_pow;
		byte pi_b=(byte) pi_pow;
		System.out.println(pi_pow+" is the value before type casting");
		System.out.println(pi_f+" is the float value after type casting (narrowing)");
		System.out.println(pi_l+" is the long value after type casting (narrowing)");
		System.out.println(pi_i+" is the int value after type casting (narrowing)");
		System.out.println(pi_s+" is the short value after type casting (narrowing)");
		System.out.println(pi_b+" is the byte value after type casting (narrowing)");
		}
}
