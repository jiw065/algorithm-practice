package math;

public class HappyNumber {
	   public boolean isHappy(int n) {
	        if(n == 37 ){ // why 37???
	            return false; 
	        }
	        String num = Integer.toString(n);
	        int result = 0; 
	        for (int i = num.length()-1; i>= 0; i--){
	            int k = Character.getNumericValue(num.charAt(i));
	            result += Math.pow(k, 2); 
	        }
	        
	        if (result == 1){
	            return true;
	        }else{
	            return isHappy(result);
	        }
	        
	    }
}
