package oops;
class Vehicle{//using method
	void start() {
		System.out.println("engine starts");
	}
	void stop() {
		System.out.println("engine stop");
	}
}
class Bike extends Vehicle{
	String Brand;
	double price;
	Bike(String Brand,double price){
		this.Brand=Brand;
		this.price=price;
	}
	void on() {
		super.start();
	}
	void off() {
		super.stop();
	}
}
class Car extends Vehicle{
	String Brand;
	double price;
	Car(String Brand,double price){
		this.Brand=Brand;
		this.price=price;
	}
	void on() {
		super.start();
	}
	void off() {
		super.stop();
	}
}
public class SuperClass {

	public static void main(String[] args) {
		Bike b=new Bike("RE",2000000);
		Car c=new Car("audi",5000000);
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
