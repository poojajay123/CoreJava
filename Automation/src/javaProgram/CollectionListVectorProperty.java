package javaProgram;

import java.util.Enumeration;
import java.util.Vector;

public class CollectionListVectorProperty {
public static void main(String[] args) {
	Vector v1 = new Vector();
	v1.addElement("Avi");
	v1.addElement("user");
	v1.addElement("guru");
	v1.addElement("megha");
	v1.addElement("nikendra");
	
	System.out.println(v1);
	Enumeration e1 = v1.elements();
	while(e1.hasMoreElements()) {
		System.out.println(e1.nextElement());
	}
	
}
}
