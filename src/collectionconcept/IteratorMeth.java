package collectionconcept;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorMeth {
	public static void main(String[] args) {
		ArrayList <Integer> a=new ArrayList <>();
		a.add(21);
		a.add(22);
		a.add(23);
		a.add(24);
		a.add(25);
		a.add(26);
		System.out.println(a);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println();
		Iterator <Integer> t=a.iterator();//iterator class. only one value will be taken
		while(t.hasNext()) {//t->returns the value & hasnext() search for next element
			System.out.println(t.next());
		}
	}

}
