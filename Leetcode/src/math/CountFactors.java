package math;

public class CountFactors {
	 public int solution(int N) {
	        // write your code in Java SE 8
	        if (N == 1 ){
	            return 1; 
	        }
	        int i = 1;
	        int count = 0;
	        while(i*i<=N){
	            if (N%i == 0){
	                if (i == N/i){
	                    count += 1;
	                }else{
	                     count += 2;
	                }
	            }
	           
	             i++;
	        }
	        return count; 
	    }
}
