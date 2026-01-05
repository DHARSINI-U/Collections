package collection2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class Hashset {

	public static void main(String[] args) {
		HashSet <Integer> s=new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(10);
		s.add(30);
		s.add(40);
		s.add(30);
		s.add(50);
		System.out.println(s);
		System.out.println();
		List<Integer>l=Arrays.asList(10,50,90);
        s.addAll(l);
        System.out.println(s);
		System.out.println(s.contains(40));
		System.out.println(s.containsAll(l));
		System.out.println(s.remove(10));
		System.out.println(s.isEmpty());
		System.out.println(s);
		System.out.println("set size:"+s.size());
		System.out.println(l);
		System.out.println("list size:"+l.size());
	}

}
