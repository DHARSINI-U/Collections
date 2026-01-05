package oops;

public class Blocks {
	static {
		System.out.println("static block 1");
	}
	{
		System.out.println("non-static block 1");
	}
	Blocks(){
		System.out.println("constructor");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		new Blocks();
		new Blocks();
		System.out.println("main ends");
	}
	static {
		System.out.println("static block 2");
	}
	{
		System.out.println("non-static block 2");
	}

}
