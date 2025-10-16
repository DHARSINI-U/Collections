package collectionconcept;
import java.util.HashMap;
import java.util.Map;
public class HashMapIteration {
	public static void main(String[]args) {
		HashMap <Character,Integer> a=new HashMap<>();
		a.put('h',4);
		a.put('u',4);
		a.put('y',4);
		a.put('d',4);
		a.put('j',4);
		a.put('l',4);
		System.out.println(a);
		for(char ch:a.keySet()) {//consists of more no.of loops. first get the key and then get its value again search it from the map
			System.out.println(ch+":"+a.get(ch));
		}
		System.out.println();
		for(int i: a.values()) {
			System.out.println(i);
		}
		System.out.println();
		for(Map.Entry<Character,Integer> t:a.entrySet()) {//consists reduce in loop , initially get both the key and value together
			System.out.println(t.getKey()+":"+t.getValue());
		}
	}

}
