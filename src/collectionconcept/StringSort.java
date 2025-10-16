package collectionconcept;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class StringSort {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		s.nextLine();
		ArrayList<String> a=new ArrayList<>();
		for(int i=0;i<c;i++) {
			String b=s.nextLine();
			a.add(b);
		}
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		for(String n:a) {
			System.out.print(n+" ");
		}
		s.close();
	}

}
