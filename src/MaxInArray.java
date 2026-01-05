package oops;

public class MaxInArray {
public static void main(String[]args) {
	int a[]= {1,3,9,6,5};
	int max=0;
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println(max);
	
}
}
