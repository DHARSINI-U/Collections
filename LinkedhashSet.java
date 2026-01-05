package collection2;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
public class LinkedhashSet {

	public static void main(String[] args) {
		LinkedHashSet <Integer> k=new LinkedHashSet<>();
		List <Integer> l=Arrays.asList(10,50,80);
		k.add(10);
		k.add(20);
		k.add(90);
		k.add(60);
		k.add(30);
		System.out.println(k);
		k.addAll(l);
		System.out.println(k);
		System.out.println(k.size());
		System.out.println(k.contains(70));
		System.out.println(k.containsAll(l));
		System.out.println(k.isEmpty());
		k.remove(10);
		System.out.println(k);
		System.out.println();
		System.out.println(k);
		System.out.println(k.remove(10));
		k.clear();
		System.out.println(k.add(10));
		System.out.println(k);
	}

}
