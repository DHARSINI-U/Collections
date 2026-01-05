package oops;
abstract class LibraryItem{
	String title;
	int itemid;
	public void disp_details(String title,int itemid) {
		this.title=title;
		this.itemid=itemid;
		System.out.println("name: "+title);
		System.out.println("id: "+itemid);
	}
	abstract double cal_fine(int d);
}
interface Borrowable{
	void borrowItem();
	void returnItem();
}

class Boook extends LibraryItem implements Borrowable{
	public double cal_fine(int d) {
		double e=5*d;
		return e;
	}
	public void borrowItem() {
		System.out.println("book borrowed");
	}
	public void returnItem() {
		System.out.println("book returned");
	}
}

class Magazine extends LibraryItem implements Borrowable{
	@Override
	public double cal_fine(int d) {
		double f=2*d;
		return f;
	}
	public void borrowItem() {
		System.out.println("book borrowed"+this.title);
	}
	public void returnItem() {
		System.out.println("book returned"+this.title);
	}
}


public class Library {
	public static void main(String[] args) {
		Boook b=new Boook();
		Magazine m=new Magazine();
		b.borrowItem();
		b.returnItem();
		b.disp_details("harry potter",165);
		System.out.println("book late for 4 days-fine:"+b.cal_fine(4));
		m.disp_details("roundr",243);
		System.out.println("magazine late for 2 days-fine:"+m.cal_fine(4));
	}

}
