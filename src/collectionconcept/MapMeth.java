package collectionconcept;
import java.util.HashMap;
import java.util.Map;
public class MapMeth {
	public static void main(String[]args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(0,"sun");//to insert the element
		m.put(1,"mon");
		m.put(3,"wed");
		m.put(4, "thur");
		m.put(2, "tue");
		System.out.println(m);
		m.put(7, "sun");
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.get(5));//if no keys like that are there it returns the null
		System.out.println(m.get(7));
		//m.remove("wed");//only it removes the value based on the key
		//System.out.println(m);
		m.remove(4);
		System.out.println(m);
		System.out.println(m.containsKey(3));
		System.out.println(m.containsKey(5));
		System.out.println(m.containsValue("thur"));
		System.out.println(m.containsValue("fri"));
		
		
	}

}
