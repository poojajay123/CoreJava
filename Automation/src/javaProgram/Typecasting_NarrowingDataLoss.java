package javaProgram;
public class Typecasting_NarrowingDataLoss {
public static void main(String[] args) {
        	double a=Math.PI;
        	float b=(float) a;
        	long c=(long) a;
        	int d=(int) a;
        	short e=(short) a;
        	byte f=(byte) a;
        	System.out.println(a+" is of double datatype");
        	System.out.println(b+" is of float datatype");
        	System.out.println(c+" is of long datatype");
        	System.out.println(d+" is of int datatype");
        	System.out.println(e+" is of short datatype");
        	System.out.println(f+" is of byte datatype");
}
}