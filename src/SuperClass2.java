package oops;
class Vehic{//using variable and constructor
	String Brand;
	double price;
	void start() {
		System.out.println("engine starts");
	}
	void stop() {
		System.out.println("engine stop");
	}
}
class Bi extends Vehicle{

	Bi(String Brand,double price){
		super(Brand,price);
		//super.Brand=Brand;
		//super.price=price;
	}
	void on() {
		super.start();
	}
	void off() {
		super.stop();
	}
}
class Cr extends Vehicle{
	
	Cr(String Brand,double price){
		super(Brand,price);
		//super.Brand=Brand;
		//super.price=price;
	}
	void on() {
		super.start();
	}
	void off() {
		super.stop();
	}
}

public class SuperClass2 {
	public static void main(String[]args) {
		Bike b=new Bi("RE",2000000);
		Car c=new Cr("audi",5000000);
		System.out.println(b.Brand);
		System.out.println(b.price);
		b.on();
		b.off();
		System.out.println(c.Brand);
		System.out.println(c.price);
		c.on();
		c.off();

	}
}
