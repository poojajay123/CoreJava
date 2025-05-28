package java_assignments;
public class ConstrctorOverloading {

	String name;
	int age;
	String course;

	ConstrctorOverloading(){
		name= "Ritika";
		age= 30;
		course = "Manual Testing";
	}

	ConstrctorOverloading(String n){
		name = n;
		age =32;
		course = "Automation Testing";
	}

	ConstrctorOverloading(String n, int a){
		name= n;
		age = a;
		course = "API Testing";
	}
	ConstrctorOverloading(String n, int a, String c){
		name= n;
		age = 23;
		course = c;
	}
	void display() {
		System.out.println("Name: " + name + ", age: " + age + ", course: " + course);
	}
	//public class ConstrctorOverloading {
	public static void main(String[] args) {

		ConstrctorOverloading p = new ConstrctorOverloading();
		ConstrctorOverloading p1 = new ConstrctorOverloading("Pooja");
		ConstrctorOverloading p2 = new ConstrctorOverloading("Priti", 32);
		ConstrctorOverloading p3 = new ConstrctorOverloading("Priya", 31, "Java Programming");
		p.display();
		p1.display();
		p2.display();
		p3.display();


	}

}
