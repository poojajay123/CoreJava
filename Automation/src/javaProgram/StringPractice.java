package javaProgram;

public class StringPractice {

	public static void main(String[] args) {
    String s = "Automation Testing";
    System.out.println(s);
    System.out.println(s.length());
    System.out.println(s.charAt(4));
    System.out.println(s.substring(4));
    System.out.println(s.substring(1, 4));
    
    String s1 = new String("Automation Testing");
    System.out.println(s1);
    
    s=s+" World ";
    System.out.println(s);
    
    s=s.concat("with Selenium Java");
    System.out.println(s);
    
    
    s = s.replace("A", "B");
    System.out.println(s);
    
    String s11="12345";
    s11= s11.replaceAll("[^0-9]","");
    System.out.println(s11);
    
    String s2 = "hello";
    s2 = s2.substring(1, 3);
    s2 = s2.concat(" world");
    System.out.println(s2);
    
    
	}

}
