package Test;

public class MinMaxElementInArray {

	public static void main(String[] args) {
int[] a = {1,2,9,8,4};
int max = a[0];
int min = a[0];
for(int i=0; i<a.length; i++) {
	if(a[i]>max) {
		max = a[i];
	}
	if(a[i]<min) {
		min=a[i];
	}
}
System.out.println("Max is:" +max);
System.out.println("min is:" +min);
	}

}
