package collectionconcept;
import java.util.ArrayList;
public class Problem {
	public static void main(String[]Args) {
		ArrayList<Integer> a=new ArrayList<>();
		//a.add(1);
		//a.add(3);
		//a.add(5);
		//a.add(8);
		//a.add(2);
		int b=a.size();
		System.out.println(b);
		if(a.isEmpty()) {
			for(int i=0;i<4;i++) {
				a.add(i);
			}
			System.out.println(a);
		}
		else if(b%2==0) {
			int c=b*2;
			int i;
			for(i=b;i<c;i++) {
				a.add(i);
			}
			System.out.println(a);
		}
		else {
			System.out.println(a);
		}
		
		
	}

}
