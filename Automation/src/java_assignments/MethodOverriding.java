package java_assignments;
//parent class
class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}
//child class
class Bike extends Vehicle{//overriding the run() method of vehicle
	@Override
	void run(){
		System.out.println("Bike is running safely");
	}
}
//main class
public class MethodOverriding {

	public static void main(String[] args) {
		Vehicle v = new Bike();//upcasting
		v.run();//overriden method in bike
		Vehicle b = new Vehicle();
		b.run();

	}

}
