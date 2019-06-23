package algorithemMethod;

public class MaxSliceSum {

	   public int solution(int[] A) {
	        // write your code in Java SE 8
	       
	       /* 
	        int maxEnd = 0;
	        int maxSum = Integer.MIN_VALUE;
	        int maxNext = 0;
	        
	        for (int i = 0; i<A.length; i++){
	            if(maxEnd > (A[i]+maxEnd) && (A[i]+maxEnd) < 0){
	                maxEnd = 0; 
	                maxEnd = Math.max(Integer.MIN_VALUE, A[i]+maxEnd);
	            }else{
	                maxNext = Math.max(A[i],A[i]+maxEnd);
	                maxEnd = Math.max(maxEnd, maxNext);
	            }
	            maxSum = Math.max(maxEnd,maxSum);
	            System.out.println("this is a debug message "+maxEnd+" "+maxSum);
	        }
	        
	        return maxSum;
	        */
	        
	        int max_ending = A[0];
	        int max_slice = A[0];
	        
	        for (int i=1; i<A.length; i++) {
	            if (max_ending<0) {
	                max_ending = A[i];
	            }
	            else {
	                max_ending = max_ending + A[i];
	            }
	            if (max_ending>max_slice) {
	                max_slice = max_ending;
	            }
	        }
	        
	        return max_slice;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
