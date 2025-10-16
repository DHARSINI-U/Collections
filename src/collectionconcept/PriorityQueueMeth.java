package collectionconcept;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueueMeth {
	public static void main(String[] args) {

		Queue<Character> q=new PriorityQueue<>();//<>((a,b)-> a-b)=>default it returns the ascending order

		PriorityQueue<Character> pq=new PriorityQueue<>((a,b) -> b-a);//returns in a descending order // this is also called manual comparision
		PriorityQueue<Character> p=new PriorityQueue<>(Comparator.comparingInt((Character x) -> x).reversed());// comparator using the built in methods
		 System.out.println(p);

		q.add('x');

		q.add('1');

		q.offer('c');

		q.add('6');

		q.add('h');

		pq.addAll(q);

		System.out.println(q);

		System.out.println(q.poll());

		System.out.println(q.poll());
		System.out.println(q.poll());

		System.out.println(pq);

		System.out.println(pq.poll());

		System.out.println(pq.poll());
		System.out.println(pq.poll());

	}
		
	}


