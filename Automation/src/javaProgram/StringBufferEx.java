package javaProgram;

public class StringBufferEx {

	public static void main(String[] args) {
StringBuffer bf = new StringBuffer("Automation Testing"); 
System.out.println(bf.substring(10));//removes first 10 char
System.out.println(bf.length());//gives length of string
System.out.println(bf.charAt(7));//gives char at index 7
System.out.println(bf.substring(1,5));//returns char from 1 to 4 index
System.out.println(bf.toString());//It Converts StringBuffer to String
System.out.println(bf.capacity());//returns the minimum capacity of string-16 + stringbuffer string
System.out.println(bf.delete(1, 6));//delete 1 to 5 char

System.out.println(bf.append(" World"));//add the World at end of String

System.out.println(bf + " World");//add the World at the end of String

System.out.println(bf.insert(5, "dear"));//it insert dear at index position 5


StringBuffer bf1 = new StringBuffer("Selenium Automation Testing"); 


System.out.println(bf1.replace(0, 5, "a"));//it removes 0 to 4 and replace with a 
	
System.out.println(bf1.reverse()); //it reverse the string


	}

}
