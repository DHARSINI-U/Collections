package oops;//neccessary data are given in the abstact
abstract class Pay{
	abstract void pay();
}
class PhonePe extends Pay{
	void pay() {
		System.out.println("phonepe payment success");
	}
}
class Gpay extends Pay{
	@Override
	void pay() {
		System.out.println("Gpay payment success");
	}
}
class Paytm extends Pay{
	@Override
	void pay() {
		System.out.println("Paytm payment success");
	}
}
public class Payment {

	public static void main(String[] args) {
		PhonePe p=new PhonePe();
		p.pay();
		Gpay g=new Gpay();
		g.pay();
		Paytm m=new Paytm();
		m.pay();
	}

}
