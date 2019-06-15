

import java.util.Arrays;

public class PermMissingElem {

	 public int solution(int[] A) {
	        // write your code in Java SE 8
	        // sort 
	        
	        if(A.length == 0){
	            return 1;
	        }
	        
	        if(A.length == 1){
	            return A[0]+1; 
	        }
	        
	       
	        Arrays.sort(A);
	         if(A[A.length-1] == A.length ){
	             return A.length + 1; 
	         }    
	        int num = 0; 
	        for(int i = 0; i< A.length; i++){
	          if(A[i] != i+1){
	              num = i+1;
	              break;
	          }
	          
	        }
	        
	        return num; 
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
