import java.util.Arrays;

public class Dominator {
	 public int solution(int[] A) {
	        // write your code in Java SE 8
	        int half = A.length/2;
	   
	        
	        if (A.length == 0){
	            return -1; 
	        }
	        if (A.length == 1){
	            return 0; 
	        }
	        
	        int[] B = new int[A.length];
	        for (int i = 0;i<A.length;i++){
	            B[i] = A[i]; 
	        }
	        Arrays.sort(B);
	        int count = 1;
	        int max = Integer.MIN_VALUE;
	        int num = -1;
	        for (int j=0 ;j <A.length -1 ;j++){
	            if (B[j] != B[j+1]){
	                
	                count = 1; 
	            }else{
	                 count++;
	            }
	            
	          
	            if(max < count){
	                 max = count;
	                 num = B[j];
	            }
	               
	        }
	        
	       // System.out.println("this is a debug message "+max+" "+num+" "+half);
	        if(max > half){
	            int i = 0;
	            while(num != A[i] && i < A.length){
	                i++;
	            }
	           
	            return i; 
	            
	        }else{
	            return -1;
	        }   
	        
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
