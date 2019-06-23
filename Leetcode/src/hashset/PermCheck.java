package hashset;
import java.util.Arrays;
import java.util.HashSet;

public class PermCheck {
	 public int solution(int[] A) {
	        // write your code in Java SE 8
	        Arrays.sort(A);
	        HashSet<Integer> ss = new HashSet<Integer>();
	        for (int i = 0; i < A.length; i++){
	            if (!ss.contains(A[i])){
	                ss.add(A[i]);
	            }else{
	                return 0;
	            }
	        }
	        
	        if (A.length != A[A.length-1]){
	            return 0;
	        }else{
	            return 1; 
	        }
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
