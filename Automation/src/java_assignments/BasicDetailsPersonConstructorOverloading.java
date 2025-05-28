package java_assignments;

public class BasicDetailsPersonConstructorOverloading {

String fname; 
String lname;
String gender;
String qualification;
String location;
int age;
double salary;
public BasicDetailsPersonConstructorOverloading(String fname, String lname, String gender, String qualification, String location) {
	this.fname = fname;
	System.out.println("Firstname: " + fname); 
	this.lname = lname;
	System.out.println("Lastname: " + lname); 
	this.gender = gender;
	System.out.println("Gender: " + gender); 
	this.qualification = qualification;
	System.out.println("Qualification: " + qualification); 
	this.location = location;
	System.out.println("Location: " + location); 
}
public BasicDetailsPersonConstructorOverloading(int age) {
	this.age = age;
	System.out.println("Age: " + age); 
}
public BasicDetailsPersonConstructorOverloading(double salary) {
	this.salary = salary;
	System.out.println("Salary: " + salary); 
}

	public static void main(String[] args) {
new BasicDetailsPersonConstructorOverloading("Pooja", "Lavhale","Female", "BE(ETC)", "Chh. Sambhajinagar");
new BasicDetailsPersonConstructorOverloading(31);
new BasicDetailsPersonConstructorOverloading(50000.50);
	}

}
