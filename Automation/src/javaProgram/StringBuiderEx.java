package javaProgram;

public class StringBuiderEx {

	public static void main(String[] args) {
StringBuilder sb = new StringBuilder("Automationn testing");
System.out.println(sb.charAt(6));//char at given string
System.out.println(sb.length());// Length of given String
System.out.println(sb.substring(5));//removes 1st 5 char i.e 0-4 
System.out.println(sb.substring(5, 10));//gives char from 5-9
System.out.println(sb.append(" With Selenium Java")); //increase string length
System.out.println(sb.insert(10, " Manual"));//use to insert at specific to index

StringBuilder sb1 = new StringBuilder("Automation testing");
System.out.println(sb1.replace(11, 19, "Selenium With Java"));// replace start to end index and 
//replace string

StringBuilder sb2 = new StringBuilder("Automation testing");
System.out.println(sb2.delete(10, 18));//delete string from specified start to end index
System.out.println(sb2.reverse());// it reverse the string

StringBuilder sb3 = new StringBuilder("Automation");
System.out.println(sb3.capacity());//gives minimum capacity of string

sb3.ensureCapacity(50);//16+10 = 26*2+2=70, 54- minimum capacity
System.out.println("New Capacity: " + sb3.capacity());	
	}
}