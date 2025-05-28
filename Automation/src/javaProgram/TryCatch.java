package javaProgram;

public class TryCatch {
	public static void main(String[] args)throws InterruptedException {
		for(int i=1; i<=50; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
