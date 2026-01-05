package collection2;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class ArrayListMeth {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		System.out.println(l.get(1));//getting the value from the index
		l.set(0,40);//setting the 1st index value to 40
		l.remove(2);//removing 2nd index value
		System.out.println(l);
		System.out.println(l.contains(40));//returns true or false , check the value in the list
		l.clear();
		System.out.println(l);
		System.out.println("*****************");
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		System.out.println(l);
		Iterator <Integer> i=l.iterator();//better than the for each loop
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(l.isEmpty());
		System.out.println();
		for(Integer n:l) {//for each loop
			System.out.println(n);
		}
	}

}
