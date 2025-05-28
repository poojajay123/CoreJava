package javaProgram;

public class StringFunction1 {

	public static void main(String[] args) {
String a = "           Automation batch 54 by GTM      ";
System.out.println(a.trim());
	
String b = "API Testing";
String c = "ramu";
System.out.println(b.replace("API", "Automation"));
System.out.println((c.replace('r', 'm')));

String d= "Pooja Laxman Lavhale";
//remove all smaller letters from the given string
System.out.println(d.replaceAll("[a-z]", ""));
//remove all capital letters from the given string
System.out.println(d.replaceAll("[A-Z]", ""));

String e = "KEVO1234TIGER";
//remove all numbers from the given string
System.out.println(e.replaceAll("[0-9]", ""));

	}

}
