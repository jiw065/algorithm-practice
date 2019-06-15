import java.util.ArrayList;
import java.util.HashSet;

public class solution {

	 public int solution(int[] A) {
	       HashSet<Integer> hs = new HashSet<Integer>();
	       int min = Integer.MAX_VALUE;
	       int max = Integer.MIN_VALUE;
	       for (int i= 0; i<A.length;i++) {
	    	   hs.add(A[i]);
	    	   if(A[i] < min && A[i] > 0){
	               min = A[i];
	           }
	           if(A[i] > max){
	               max = A[i]; 
	           }
	       }
	       
	       if (max <= 0){
	           return 1;
	       }else{
	    	   int num = min; 
	           while(hs.contains(num)) {
	        	   num++;	          	   	        	   
	           }
	    	   
	    	   return num+1; 
	    	   
	    	   
	       }
	       
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aaa = Integer.toBinaryString(999);
		aaa.toCharArray();
		
	}

}
