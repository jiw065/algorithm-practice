
public class MaxProfit {

	public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length < 2){
            return 0; 
        }
        int min = A[0];
        int maxProfit = A[1]-A[0];
        for (int i = 0;i<A.length;i++){
           min = Math.min(A[i],min);
           maxProfit = Math.max(maxProfit, (A[i]-min));
        }
        
        return maxProfit; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
