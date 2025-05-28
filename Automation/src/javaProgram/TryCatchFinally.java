package javaProgram;

public class TryCatchFinally{

	public static void main(String[] args) {
		// int a=b/c ; b can come from parent class //c can also come from grandparent class
		//1/1=1;
		//0/1=0;
		//1/0=infinite
		try {
			int a=1/0;
			System.out.println(a);
		}
		catch(ArithmeticException a1){
			System.out.println("Handled The Exception");
		}
		finally{
				System.out.println("Closing the connection with DB");
			}
		}
	}



