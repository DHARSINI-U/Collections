package multithread;

public class ThirdMax {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int max=0;
		int smax=0;
		int tmax=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>max) {
				tmax=smax;
				smax=max;
				max=a[i];
			}
		}
		System.out.println(max);
		System.out.println(smax);
		System.out.println(tmax);
	}

}
