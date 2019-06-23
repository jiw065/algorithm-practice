package math;

public class ReverseInteger {
	public int reverse(int x) {
        long rev = 0;
        
        while (x>=1||x<=-1){
         rev = rev*10 + x%10;
       if ((rev > Integer.MAX_VALUE)||(rev < Integer.MIN_VALUE)){
            return 0; 
         }
         x/=10;
            
        }
        
        return (int) rev ; 
    }
}
