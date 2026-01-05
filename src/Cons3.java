package oops;
import java.util.Scanner;
class Am{
	String name;
	int roll;
	float cgpa;
	String dpt;
	Am(String name,int roll,float cgpa,String dpt){
		this.name=name;
		this.roll=roll;
		this.cgpa=cgpa;
		this.dpt=dpt;
	}

public void disp() {
	System.out.println(name);
	System.out.println(roll);
	System.out.println(cgpa);
	System.out.println(dpt);

}
}
public class Cons3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
		int b=s.nextInt();
		float c=s.nextFloat();
		s.nextLine();
		String d=s.nextLine();
		Am a=new Am(n,b,c,d);
		a.disp();
		
				
	}

}
