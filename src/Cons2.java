package oops;
class An{
	static int a;
	int b;
	An(int a,int b){
		this.a=10;//the value reassigned from 100 to the num 10
		this.b=20;
	}
}
public class Cons2 {
	public static void main(String[] args) {
		An a=new An(100,200);
		System.out.println(a.a);
		System.out.println(a.b);
	}

}
