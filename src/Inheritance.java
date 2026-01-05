package oops;
class A{
	public static void m1() {
		System.out.println("hii");
		
	}
}
class B{
	public static void m2() {
		System.out.println("hello");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		A.m1();
		B.m2();//no need to create object for static methods...they can work without object
		A a=new A();
		a.m1();//a static method can also be accessed using object
		
	} 

}
