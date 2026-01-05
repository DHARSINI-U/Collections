package oops;
class Bag{
	public void it1() {
		System.out.println("note");
	}
}
class Book extends Bag{
	public void nam() {
		System.out.println("theory");
	}
}
class Aurthor extends Book{
	public void nam2() {
		System.out.println("harry");
	}
}
public class MultilevelInheritence {
	public static void main(String[]args) {
		Aurthor a=new Aurthor();
		a.it1();
		a.nam();
		a.nam2();
	}

}
