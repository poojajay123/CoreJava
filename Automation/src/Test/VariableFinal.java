package Test;

public class VariableFinal {

final int x=10;
void modify(){
	//x = 20; compile time error
	System.out.println(x);
}

	
public static void main(String[] args) {
	VariableFinal test = new VariableFinal();
	test.modify();
}
}
