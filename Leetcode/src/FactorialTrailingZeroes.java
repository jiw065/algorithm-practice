
public class FactorialTrailingZeroes {
	  public int trailingZeroes(int n) {

		     int cnt = 0;
		        while(n > 0){
		            n /= 5; // count how many 5! n has(mod ==0)  example 20!/5! => 20/5
		            cnt += n;
		        }
		        return cnt;
		    }
}
