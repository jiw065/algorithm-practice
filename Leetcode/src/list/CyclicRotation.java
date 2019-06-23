package list;
import java.util.Deque;
import java.util.LinkedList;

public class CyclicRotation {
	public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if (A.length == 0){
            return A; 
        }
        
        Deque<Integer> q = new LinkedList<Integer>();
        for(int i =A.length-1; i>=0 ;i--){
            q.addFirst(A[i]);
        }
        int i = K;
        while(i>0 ){
            Integer num = q.removeLast();
            q.addFirst(num); 
            i--;
        }
        int[] B = new int[A.length];
        int j = 0;
        for(int k: q ){
            B[j] = k;
            j++;
        }
        
        return B;
    }
}
