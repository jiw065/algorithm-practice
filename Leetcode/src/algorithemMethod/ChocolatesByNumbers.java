package algorithemMethod;

public class ChocolatesByNumbers {
	public int gcd(int N,int M){
        if(N%M == 0){
            return M;
        } 
        
        return gcd(M,N%M);
        
        
    }    
    public int solution(int N, int M) {
        // write your code in Java SE 8
        
      //  System.out.println("this is a debug message "+gcd(N,M));
       return N/gcd(N,M);
    }
}
