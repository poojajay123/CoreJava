package javaProgram;

public class StringFunction0 {

	public static void main(String[] args) {
String s = "Pooja";
int a =s.length();
System.out.println(a);

String b = "Pooja";
boolean f =b.equals("pooja");
System.out.println(f);

String c = "Pooja Laxman Lavhale";
boolean c1 = c.contains("Pooja"); 
System.out.println(c1);

String d = "Pooja Laxman Lavhale";
boolean d1 = d.equalsIgnoreCase(d);
System.out.println(d1);

String g = "pooja laxman Lavhale";
String k = "Pooja laxman Lavhale";
boolean k1 =  k.equalsIgnoreCase(g);
System.out.println(k1);
boolean j =g.equals(k);
System.out.println(j);

String e = "Poojaala";
int e1 = e.lastIndexOf('P');
System.out.println(e1);
String m = e.replace('o','l');
System.out.println(m);
String p= e.replace('o', 'i');
System.out.println(p);
String i = "Pooja Laxman Lavhale";
String i1 = i.replaceAll("Pooja", "Kaku");
System.out.println(i1);
String i2 = i.repeat('o');
System.out.println(i2);

String f1 = "pooja";
int f2 = f1.indexOf('j');
System.out.println(f2);
String f4 = f1.substring(1, 4); //return char at index 2,3
System.out.println(f4);
String f3 = f1.substring(2);
System.out.println(f3);



	}
}


