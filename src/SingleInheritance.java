package oops;
class C{
	public void m1() {
		System.out.println("hii");
		
	}
}
class D extends C{
	public static void m2() {
		System.out.println("hello");
	}
}

public class SingleInheritance {
	public static void main(String args[]) {
		D b=new D();
		b.m1();
		b.m2();
	}

}
