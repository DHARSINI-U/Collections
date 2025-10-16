package collectionconcept;
import java.util.Queue;
import java.util.LinkedList;
public class QueueMeth {
	public static void main(String[]args) {
		Queue <String> a=new LinkedList<>();
		System.out.println(a.poll());
		System.out.println(a.peek());		
		a.add("hii");
		a.add("hello");
		a.add("welcome");
		a.add("kaiko");
	    System.err.println(a);//the err-> used to throw a manual error. so the compiler gives a output as red color
	    System.out.println(a.poll());
	    System.out.println(a.peek());
	    System.out.println(a);
	    System.out.println(a.size());
	    System.out.println(a.isEmpty());
	    a.clear();
	    System.out.println(a);
	}

}
