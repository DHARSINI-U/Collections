package collectionconcept;
import java.util.HashMap;
public class ArrayMap {
	public static void main(String[] args) {

		int arr[]=new int[256];

		String st="abac12";

		HashMap<Character,Integer> mp=new HashMap<>();

		for(char ch:st.toCharArray()) {

			arr[ch]++;   //Freq Array

		}

		for(int i=97;i<122;i++) {

			System.out.println((char)i+" : "+arr[i]);

		}




		//for HashMap

		for(char ch:st.toCharArray()) {

			if(mp.containsKey(ch)) {

				mp.put(ch, mp.get(ch)+1);

			}

			else {

				mp.put(ch, 1);

			}

		}

		System.out.println("\n\nBy Map --> "+mp);

	}

}
