package collectionconcept;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Frequency {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String a=s.nextLine();
		LinkedHashMap <Character,Integer> m= new LinkedHashMap<>();
		for(char c:a.toCharArray()) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}
			else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
		int max=0;
		char ch='*';
		for(char b:m.keySet()) {//time complexity more
			int q=m.get(b);
			if(q>max) {
				max=q;
				ch=b;
		
			}
		}
		System.out.println(ch);
		
		/*for(Map.Entry <Character,Integer> t=m.entrySet()) {  //time complexity less and more efficient
			if(t.getValue()>max) {
				max=t.getValue();
				c=t.getKey();
			}
		}*/
		
		for(char b:m.keySet()) {
			
			
		}
	}

}
