package oops;
class Whatsapp_1{//method overriding
	void message() {
		System.out.println("single tick");
	}
}
class Whatsapp_2 extends Whatsapp_1{
	void call() {
		System.out.println("voice call");
	}
}
class Whatsapp_3 extends Whatsapp_2{
	void message() {
		System.out.println("double tick");
	}
}
class Whatsapp_4 extends Whatsapp_2{
	void message() {
		System.out.println("blue tick");
	}
}
class Whatsapp_5 extends Whatsapp_3{
	void call() {
		System.out.println("Hd call");
	}
}
class Whatsapp_6 extends Whatsapp_5{
	void call() {
		System.out.println("video call");
	}
}
public class Polymor {
	public static void main(String[] args) {
		Whatsapp_1 a=new Whatsapp_1();
		a.message();
		System.out.println();
		Whatsapp_2 b=new Whatsapp_2();
		b.message();
		b.call();
		System.out.println();
		Whatsapp_3 c=new Whatsapp_3();
		c.message();
		c.call();
		System.out.println();
		Whatsapp_4 d=new Whatsapp_4();
		d.message();
		d.call();
		System.out.println();
		Whatsapp_5 e=new Whatsapp_5();
		e.message();
		e.call();
		System.out.println();
		Whatsapp_6 f=new Whatsapp_6();
		f.message();
		f.call();
				
	}

}
