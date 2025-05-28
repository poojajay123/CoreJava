package java_assignments;
//Multilevel Inheritance

class Animal3{
	void eat() {
		System.out.println("Animal is eating...");
	}
}
class Dog3 extends Animal3 {
	void bark() {
		System.out.println("Dog is barking...");
	}
}
	class Puppy1 extends Dog3 {
		void weep() {
			System.out.println("Puppy is weeping...");
		}
	}
	public class MultilevelInheritance{
		public static void main(String[] args) {
			Puppy1 cat = new Puppy1();
			cat.bark();
			cat.weep();
			cat.eat();

		
		}
}
