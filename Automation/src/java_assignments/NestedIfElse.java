package java_assignments;

public class NestedIfElse {

	public static void main(String[] args) {
		int age = 19; 
		int Weight = 60;
		if(age >= 18) {
			if(Weight >= 50) {
				System.out.println("You are Eligible to donate blood.");
			}else {
				System.out.println("You are not Eligible to donate blood due to insufficient weight.");
			}
		}else {
			System.out.println("You are not Eligible to donate blood due to age restrictions.");
		}
	}
}
