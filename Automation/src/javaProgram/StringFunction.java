package javaProgram;

public class StringFunction {

	public static void main(String[] args) {
String s = "college";
String s1 = s.toUpperCase();
System.out.println(s1);

String t = "HOSPITAL";
String t1 = t.toLowerCase();
System.out.println(t1);

String c ="I am a Student ";
String c1 = "of batch 54";
System.out.println(c.concat(c1));
//System.out.println(c.concat("of batch 54"));

String d = "Laptop of Beand Apple";
System.out.println(d.substring(5));
String d1 = d.substring(2, 5);
System.out.println(d1);


	}

}
