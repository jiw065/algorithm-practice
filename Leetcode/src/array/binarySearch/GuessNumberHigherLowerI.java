package array.binarySearch;

public class GuessNumberHigherLowerI {
	 public int guessNumber(int n) {
	        int low = 1;
	        int high = n;
	        
	        while (low<=high){
	            int mid = low+(high-low)/2;
	            if(guess(mid) == 0){
	                return mid;
	            }else if(guess(mid) == -1){
	                high = mid-1; 
	                
	            }else if(guess(mid) == 1){
	                low = mid+1;
	            }
	        }
	        
	        return n; 
	    }
}
