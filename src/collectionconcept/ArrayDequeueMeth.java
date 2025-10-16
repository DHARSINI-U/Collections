package collectionconcept;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Deque;
public class ArrayDequeueMeth {
	public static void main(String[]args) {
		Deque <Integer> a=new ArrayDeque<>();//arraydeque child to the deque
		Deque <Integer> b=new LinkedList<>();//linked list child to the deque
		a.offer(10);
		a.offer(20);
		a.offer(40);
		a.offerFirst(12);
		a.offerLast(1);
		b.offer(1);
		b.offer(2);
		b.offer(4);
		b.offerFirst(2);
		b.offerLast(10);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.poll());
		System.out.println(b.poll());
		
		
	}

}
