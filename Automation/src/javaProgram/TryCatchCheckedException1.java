package javaProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchCheckedException1 {

	public static void main(String[] args)throws FileNotFoundException {
FileInputStream f1 = new FileInputStream("C:\\Users\\Dell\\OneDrive\\Desktop");
System.out.println(f1);
	}

}
