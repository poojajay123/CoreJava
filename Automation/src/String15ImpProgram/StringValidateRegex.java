package String15ImpProgram;

public class StringValidateRegex {

	public static void main(String[] args) {
String str = "abcsfSZ14576";
//Only letters and number
boolean isValid = str.matches("[a-zA-Z0-9]+");
System.out.println("Is valid: "+ isValid);
	}
}

