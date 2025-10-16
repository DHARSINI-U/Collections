package collectionconcept;
import java.util.LinkedList;
public class LinkedlistMeth {
	public static void main(String[]args) {
		LinkedList<Integer> a= new LinkedList<>();//syntax 
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(30);
		System.out.println(a);
		a.addFirst(40);
		a.addLast(50);
		System.out.println(a);
		a.add(60);
		a.add(3,90);
		System.out.println(a);
		a.remove();//removes first element
		System.out.println(a);
		a.removeLast();//removes last element
		System.out.println(a);
		a.remove(2);//removes a particular index
		System.out.println("after removing a particular index: "+a);
		a.removeFirstOccurrence(30);//checks the beginning and removes the given element
		System.out.println(a);
		a.add(20);
		System.out.println(a);
		a.removeLastOccurrence(20);//checks from the last and removes the given element
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf(3));//if the element is not in the list it returns -1
		System.out.println(a.indexOf(30));//returns the index of the element
		a.clear();
		System.out.println(a);
		
	}

}
