package collection2;
import java.util.HashMap;
public class Hashmap {

	public static void main(String[] args) {
		HashMap <Integer,Integer> h=new HashMap<>();
		h.put(1, 100);
		h.put(3, 300);
		h.put(2, 200);
		h.put(3, 300);
		h.put(4, 400);
		h.put(2, 200);
		h.put(6, 800);
		System.out.println(h);
		System.out.println(h.get(4));//return value for the key
		System.out.println(h.get(400));//the value is given inside so it returns null
		System.out.println(h.size());
		System.out.println(h.containsKey(1));
		System.out.println(h.containsValue(500));
		System.out.println(h.keySet());
		System.out.println(h.values());
		h.remove(100);//removes the key and its value but here i mention the value so it nothing change 
		System.out.println(h);
		h.remove(3);
		System.out.println(h);
		
		
		
	}

}
