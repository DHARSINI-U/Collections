package oops;// method overloading(polymorphism)
class Ab{
	String name;
	int roll;
	Ab(String name){
		this.name=name;
	}
	Ab(String name,int roll){
		this.name=name;
		this.roll=roll;
	}
	public void disp() {
		System.out.println(name);
		System.out.println(roll);
	}
	
}
public class Cons4 {
	public static void main(String[] args) {
		Ab a=new Ab("Anu",16);//if 016 it is considered as octal that output will become 14
		Ab b=new Ab("vino");
		a.disp();
		b.disp();
	}

}
