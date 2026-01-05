package oops;
class Bankacc{
	private String name;
	private Double balance;
	Bankacc(String name,double balance){
		this.name=name;
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public double setBalance(double Amount) {
		this.balance=this.balance+Amount;
		return balance;
	}
}
public class Encapsul {
	public static void main(String[] args) {
		Bankacc b=new Bankacc("anu",900000);
		System.out.println(b.getBalance());
		System.out.println(b.setBalance(400000));
	}

}
