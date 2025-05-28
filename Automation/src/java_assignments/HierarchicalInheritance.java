package java_assignments;
class Animal2 {
	void eat() {
		System.out.println("Animal is eating...");
	}
}
class Dog2 extends Animal2{
	void bark() {
		System.out.println("Dog is barking...");
	}
}
class Cat extends Animal2{
	void meow() {
		System.out.println("Cat is meowing...");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		System.out.println("Cat: ");
		Cat cat = new Cat();
		cat.eat();
		cat.meow();

		System.out.println("Dog2: ");
		Dog2 dog2 = new Dog2();
		dog2.bark();
		dog2.eat();
	}

}
