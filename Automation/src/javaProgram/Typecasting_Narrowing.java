package javaProgram;
public class Typecasting_Narrowing {
	public static void main(String[] args) {
		double golden_ratio=1.6987654312123456789909876544321;
		float golden_ratio_f=(float) golden_ratio;
		float golden_ratio_i=(float) golden_ratio;

		System.out.println(golden_ratio_f+ " is the float value after typecasting(narrowing)");
		System.out.println(golden_ratio_i+ " is the int value after typecasting(narrowing)");

	}
}