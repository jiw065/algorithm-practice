import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<Integer>();
		Deque<Integer> bl = new LinkedList<Integer>();
		int[] a = {1,2,3,4,5};
		for(int i =0; i<a.length;i++  ) {
			al.add(i, a[i]);
			
		}
		bl.addAll(al);
		bl.removeFirst();
		al.remove(3);
		
		for (Integer i : al) {

			System.out.println(i);
		}
		
		
	}

}
