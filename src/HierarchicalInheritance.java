package oops;
class M1{
	public void m1() {
		System.out.println("bag");
	}
}
class M2 extends M1{
	public void m2() {
		System.out.println("note");
	}
}
class M3 extends M1{
	public void m3() {
		System.out.println("book");
	}
}
public class HierarchicalInheritance {
	public static void main(String[]args) {
		M2 a=new M2();
		M3 b=new M3();
		a.m1();
		a.m2();
		b.m1();
		b.m3();
	}

}
