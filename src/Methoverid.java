package oops;
class Animal{//no static in override
   void sound() {
		System.out.println("Sound");
	}
}
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("barks");
	}
}
public class Methoverid {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
	}

}
