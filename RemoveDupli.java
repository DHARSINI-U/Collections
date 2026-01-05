package collection2;
import java.util.ArrayList;
import java.util.List;
class soln{
	public List<Integer> removeDuplicates(List<Integer>lst){
		List<Integer> l=new ArrayList<>();
		for(int num:lst) {
			if(!l.contains(num)) {
				l.add(num);
			}
		}
		return l;
	}
}
public class RemoveDupli {

	public static void main(String[] args) {
		soln s=new soln();
		List<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(3);
		a.add(4);
		System.out.println(a);
		System.out.println(s.removeDuplicates(a));
	}

}
