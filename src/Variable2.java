package oops;

public class Variable2 {
	static int a;//static variable
	int b;//non static variable

	public static void main(String[] args) {
		int c;//local variable
		c=20;
		Variable2.a=40;
		System.out.println(Variable2.a);
		System.out.println(c);
		Variable2 m=new Variable2();
		m.b=70;
		System.out.println(m.b);
		Variable2 m1=new Variable2();
		m1.b=20;
		m1.a=60;
		m1.b=100;
		System.out.println(m1.b);
		System.out.println(a);
	}

}
