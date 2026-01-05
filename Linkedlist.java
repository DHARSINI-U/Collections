package collection2;

import java.util.LinkedList;
public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);
		System.out.println();
		a.addFirst(100);//add the first element
		a.addLast(200);//add the last element
		System.out.println(a);
		System.out.println();
		a.remove();//removes first element
		a.removeFirst();//removes first element
		a.removeLast();//removes last element
		System.out.println(a);
		System.out.println();
		System.out.println(a.get(3));
		System.out.println(a.contains(10));
		System.out.println(a.size());
		a.add(2,80);
		System.out.println(a);
		a.remove(3);//removing the particular index value
		System.out.println(a);
		
	}

}
