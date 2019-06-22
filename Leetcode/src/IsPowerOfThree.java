
public class IsPowerOfThree {
	public boolean isPowerOfThree(int n) {
        if (n/3 == 1 && n%3 == 0 || n == 1){
            return true; 
        }else if(n%3 != 0 || n ==0 ){
            return false; 
        }
        
        boolean flag = isPowerOfThree(n/3);
        return flag; 
        
    }
}
