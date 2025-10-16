package collectionconcept;
import java.util.Stack;
public class StackMeth {
	public static void main(String[]args) {
		Stack <Integer> a=new Stack<>();
		a.push(100);//insert element into stack
		a.push(200);
		a.push(300);
		a.push(400);
		a.push(600);
		System.out.println(a);
		System.out.println(a.pop());//displays the last element and remove it
		System.out.println(a.peek());//displays the last element
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.empty());
		System.out.println(a.add(200));// add() also works in stack
		System.out.println(a);
		a.clear();
		System.out.println(a);
		System.out.println(a.capacity());
		
	}

}
