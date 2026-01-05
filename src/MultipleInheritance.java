package oops;
interface I1{
	void m1();
}
interface I2{
	void m2();
}
class R implements I1,I2{
	public void m1() {
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		R r=new R();
		r.m1();
		r.m2();
	}

}
