
public class TapeEquilibrium {
	 public static int solution(int[] A) {
	        // write your code in Java SE 8
	        // 0 ~ A.length = p
	        if (A.length == 2){
	            return Math.abs(A[1]-A[0]);
	        }
	        
	        //right sum
	        long sum = 0;
	        for(int j=0; j<=A.length-1;j++ ){
	            sum += A[j];
	        }
	        
	        int min = Integer.MAX_VALUE;
	        long leftSum = 0; 
	        long rightSum = sum; 
	        for (int i = 0; i<A.length;i++){
	           leftSum +=  A[i];
	           rightSum -= A[i];
	           // System.out.println("this is a debug message"+leftSum+" "+rightSum);
	            if (Math.abs(rightSum-leftSum) < min && sum!= rightSum){
	                min = (int)Math.abs(rightSum-leftSum);
	                
	                if (min == 0){
	                    break;
	                }
	            }
	        }
	        
	        return min; 
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
