package oops;
interface PAy{
	void pay();
}
class Phonepe implements PAy{
	public void pay() {
		System.out.println("phonepe payment success");
	}
}
class GPay implements PAy{
	@Override
	public void pay() {
		System.out.println("Gpay payment success");
	}
}
class PaytM implements PAy{
	@Override
	public void pay() {
		System.out.println("Paytm payment success");
	}
}

public class UseInterface {

	public static void main(String[] args) {
		Phonepe p=new Phonepe();
		p.pay();
		GPay g=new GPay();
		g.pay();
		PaytM m=new PaytM();
		m.pay();
	}

}
