package hashset;
import java.util.HashSet;

public class FrogRiverOne {

	public int solution(int X, int[] A) {
        // write your code in Java SE 8
       HashSet<Integer> hs = new HashSet<Integer>();
       int step = 0; 
       int count = -1; 
       for(int i = 0; i<A.length;i++){
           if (A[i] <= X && hs.add(A[i])){
             step++;
            // System.out.println("this is a debug message "+A[i]+" "+i);
           }
           
           if (step == X){
               count = i;
               break;
           }
       }
       
       return count; 
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
