package math;

public class MinPerimeterRectangle {
	public int solution(int N) {
        // write your code in Java SE 8
        
        int a = 1;
        int b = 0;  
        int min = Integer.MAX_VALUE;
        int per = 0; 
        while(a*a <= N){
            if(N%a == 0){
                b = N/a;
                per = 2*(a+b);
                min = Math.min(min, per);
                
            }
            a++;
        }
        
        return min; 
    }
}
