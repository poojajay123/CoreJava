package javaProgram;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

	public static void main(String[] args) {
Map m3 = new HashMap();
//Upcasting HashMap To Map
m3.put("Student1", "Manish");
m3.put("Student2", "Abhishek");
m3.put("Student3", "Sunita");
m3.put("Student4", "Jeetu");

Map m4 = new HashMap();
m4.put("Student5", "Reeyansh");
m4.put("Student6", "Priya");


Map m5 = new HashMap();
m5.put("Student5", "Reeyansh");
m5.put("Student6", "Priya");

System.out.println(m3);
m3.putAll(m4);
System.out.println(m4);
System.out.println(m3);
//m4.clear();
//System.out.println(m4);
boolean b = m4.equals(m5);
System.out.println(b);
	}

}
