package collectionconcept;
import java.util.ArrayList;
public class ArraylistMeth {
	public static void main(String[]args) {
	ArrayList<Integer> a= new ArrayList<>();
	a.add(1);
	a.add(5);
	a.add(0,8);//update the value in the index
    a.set(1, 16);//replace the value to the index
	System.out.println(a);
	ArrayList<String> b=new ArrayList<>();
	b.add("hii");
	b.add("hello");
	b.add("cse");
	b.add("it");
	System.out.println(b);
	b.add(0,"aids");
	b.add(2,"main");
	System.out.println(b);
	System.out.println(b.contains("abi"));//return true or false
	System.out.println(b.contains("main"));//return boolean value
	System.out.println(a.isEmpty());//return boolean value
	System.out.println(b.get(2));
	System.out.println(b.remove(2));
	System.out.println(b);
	System.out.println(b.remove("hii"));
	System.out.println(b);
	b.add(3,"hello");
	System.out.println(b);
	System.out.println("before clear= "+b);
	b.clear();
	System.out.println("after clear= "+b);
	}
}
