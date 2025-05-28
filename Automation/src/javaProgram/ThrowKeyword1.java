package javaProgram;

public class ThrowKeyword1 {

	public static void main(String[] args)throws NullPointerException, ArithmeticException   {
if(1==2) {
	throw new NullPointerException();
}
else {
	throw new ArithmeticException();
}
	}

}
