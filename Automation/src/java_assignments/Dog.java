package java_assignments;
// Single inheritance
	class Animal{
		void eat() {
			System.out.println("Animal is eating...");
		}
	}
	public class Dog extends Animal{
		void bark() {
			System.out.println("Dog is barking...");
		}
	
	

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
	}

}
