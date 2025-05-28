package java_assignments;

abstract class Vehicle5{
	abstract void start();//abstract method(no body)

	void stop() {//concrete method (has body)
		System.out.println("Vehicle has stopped");
	}

}

//concrete class
class Car extends Vehicle5{//implementing abstract method
	void start() {
		System.out.println("car has started");
	}

}
//another concrete class
class Bike5 extends Vehicle5{//implementing abstract method
	void start() {
		System.out.println("Bike has started"); 
	}

}
public class AbstractandConcreteClass {

	public static void main(String[] args) {
		Car car = new Car();
		Bike5 bike = new Bike5();

		car.start();//o/p-car has started
		car.stop();//o/p-vehicle has stopped
		bike.start();//o/p-bike has started 
		bike.stop();//o/p-vehicle has stopped

	}
}

