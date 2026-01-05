package collection2;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.List;
public class Treeset {

	public static void main(String[] args) {
		TreeSet<Integer> s=new TreeSet<>();
		List<Integer>l=Arrays.asList(10,60,80);
		s.add(10);
		s.add(70);
		s.add(50);
		s.add(90);
		s.add(30);
		s.add(40);
		System.out.println(s);
		s.addAll(l);
		System.out.println("tree set:"+s);
		System.out.println("list:"+l);
		System.out.println("set size:"+s.size());
		System.out.println("list size:"+l.size());
		System.out.println(s.contains(40));
		System.out.println(s.containsAll(l));
		System.out.println(s.isEmpty());
		s.remove(70);
		System.out.println(s);
		s.removeAll(l);
		System.out.println(s);
		System.out.println(s.remove(10));
		s.clear();
		System.out.println(s);
		
	}

}
