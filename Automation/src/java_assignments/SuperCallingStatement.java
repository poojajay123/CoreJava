package java_assignments;
class Animals{
	Animals(){
		System.out.println("Animals constructor called");
	}
	void sound() {
		System.out.println("Animals makes sound");
	}
}

class Dogs extends Animals{
	Dogs(){
		super();
		System.out.println("Dog constructor called");
	}

	void sound() {
		super.sound();
		System.out.println("Dog Barks.");
	}
}

public class SuperCallingStatement {

	public static void main(String[] args) {
Dogs dog = new Dogs();
dog.sound();
	}

}
