package array.binarySearch;

public class Sqrtx {
	 //binary search
    public int mySqrt(int x) {
         if (x == 0) return 0;
        int low = 1, high = Integer.MAX_VALUE;
         while (low<=high) {
            int mid = low+(high-low)/2;
            if(mid == x/mid){
                return mid;
            }else if(mid < x/mid){
                low = mid +1;
            }else if(mid > x/mid){
                high = mid-1; 
            } 
        }
        
        return low-1; 
    }
    
    
    // brute force
    public int mySqrt1(int x) {
        int n = 0; 
        while(n*n < x){
            n++;
        }
        if (n*n == x){
            return n;
        }else{
            return n-1; 
        }
    }
}
