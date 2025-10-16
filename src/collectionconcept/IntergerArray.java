package collectionconcept;
import java.util.ArrayList;
import java.util.Scanner;
public class IntergerArray {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<5;i++) {
			int b=s.nextInt();
			a.add(b);
		}
		System.out.println(a);
		s.close();
	}
}
