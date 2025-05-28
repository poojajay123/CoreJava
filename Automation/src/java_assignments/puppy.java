package java_assignments;
//Multilevel Inheritance
class Animal1{
	void eat() {
		System.out.println("Animal is eating...");
	}
}
class Dog1 extends Animal1{
	void bark() {
		System.out.println("Dog is barking...");
	}
}
public class puppy extends Dog1{
	void weep() {
		System.out.println("Puppy is weeping...");
	}

	public static void main(String[] args) {
		puppy ob = new puppy();
		ob.weep();
		ob.bark();
		ob.eat();
	}

}
