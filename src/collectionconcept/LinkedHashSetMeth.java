package collectionconcept;
import java.util.Set;
import java.util.LinkedHashSet;
public class LinkedHashSetMeth {
	public static void main(String[]args) {
		Set <String> a=new LinkedHashSet<>();
		a.add("red");
		a.add("blue");
		a.add("green");
		a.add("red");
		a.add("green");
		a.add("black");
		a.add("brown");
		System.out.println(a);
		a.add("black");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		a.remove("red");
		System.out.println(a);
		System.out.println(a.contains("blue"));
		a.clear();
		System.out.println(a);
		
	}


}
