package oops;
interface R3{
	void m3();
}
interface R1 extends R3{
	void m1();
}
interface R2 extends R3{
	void m2();
}
class Y implements R1,R2{
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}
	public void m3() {
		System.out.println("m3");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		Y e=new Y();
		e.m1();
		e.m2();
		e.m3();
		
	}

}
