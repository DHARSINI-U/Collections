package oops;
class s{
	String name;
	int roll;
	float cgpa;
	String dpt;
	public s(String name) {
		this.name=name;
	}
	public s(String name,int roll) {
		this(name);
		this.roll=roll;
	}
	public s(String name,int roll,float cgpa) {
		this(name,roll);
		this.cgpa=cgpa;
	}
	public s(String name,int roll,float cgpa,String dpt) {
		this(name,roll,cgpa);
		this.dpt=dpt;
	}
	public void disp() {
		System.out.println(name);
		System.out.println(roll);
		System.out.println(cgpa);
		System.out.println(dpt);

	}

}
public class Cons5 {
	public static void main(String[] args) {
		s a=new s("anu");
		s b=new s("anu",13);
		s c=new s("anu",13,8.7f);
		s d=new s("anu",13,8.7f,"cse");
		a.disp();
		b.disp();
		c.disp();
		d.disp();
		
	}

}
