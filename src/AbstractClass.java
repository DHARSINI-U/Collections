package oops;
abstract class Vehical{
	void start() {
		System.out.println("engine starts");
	}
	abstract void stop();
}
class Bik extends Vehical{
	void stop() {
		System.out.println("engine off");
	}
	
}
public class AbstractClass {
	public static void main(String[]args) {
		new Bik().stop();//this has an unused object , so the garbage collector will automatically remove it thus saves the space
	}
}
