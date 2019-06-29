package array.binarySearch;

public class FirstBadVersion {
	 public int firstBadVersion1(int n) {
	      int left = 1;
	      int right = n;
	      int mid = 0;
	      while(left<=right){
	          mid = left+(right-left)/2;
	          if(!isBadVersion(mid)){
	              left = mid+1;
	          }else{
	              if (!isBadVersion(mid-1)){
	                  return mid;
	              }
	              right = mid-1;           
	          }

	      }
	        
	        return left; 
	        
	    }
	 
	 
	 public int firstBadVersion(int n) {
	      int left = 1;
	      int right = n;
	      int mid = 0;
	      while(left<right){
	          mid = left+(right-left)/2;
	          if(!isBadVersion(mid)){
	              left = mid+1;
	          }else{
	              
	              right = mid;           
	          }

	      }
	        
	        return left; 
	        
	    }
}
