import java.util.Arrays;
import java.util.HashSet;

public class MissingInteger {

	 public int solution(int[] A) {
	        // write your code in Java SE 8
	        if (A.length == 1 ){
	           if(A[0] == 1){
	               return 2;
	           }else{
	               return 1;
	           }
	        }
	        
	        Arrays.sort(A);
	        if (A[A.length-1] <=0 ){
	            return 1; 
	        }
	        
	        HashSet<Integer> hs = new HashSet<Integer>();
	        int count = 1;
	        for (int i =0;i< A.length;i++){
	            if (A[i] > 0 && hs.add(A[i])){
	               if (A[i] == count){
	                   count++;
	               }else{
	                   return count; 
	               }
	            } 
	        }
	        
	        
	        return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
