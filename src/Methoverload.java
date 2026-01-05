package oops;
//compile time polymorphism
public class Methoverload {//methodoverloading in polymorphism
	public static void add() {
		System.out.println(10+10);
	}
	public static void add(int a) {
		System.out.println(10+a);
	}

	public static void main(String[] args) {
		add();
		add(30);
	}

}
