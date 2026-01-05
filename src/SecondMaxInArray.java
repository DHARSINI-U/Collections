package oops;

public class SecondMaxInArray {
	public static void main(String[] args) {
		int a[]={4,6,2,5,9,1};
		int max=0;
	    int smax=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>max) {
				smax=max;
				max=a[i];
			}
		}
		System.out.println(smax);
	}

}
