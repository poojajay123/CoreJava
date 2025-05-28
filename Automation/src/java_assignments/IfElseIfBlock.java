package java_assignments;

public class IfElseIfBlock {

	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 50;
		int num3 = 75;
		if(num1 >=num2 && num1 >= num3) {
			System.out.println(num1 + " is the largest number.");
		}
		else if(num2 >=num1 && num2 >= num3) {
			System.out.println(num2 + " is the largest number.");
		} else {
			System.out.println(num3 + " is the largest number.");
		}
	}

}
