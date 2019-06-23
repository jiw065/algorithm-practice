package array;

public class ArrayRotation {

	 public static int[] solution(int[] A, int K) {
	        // write your code in Java SE 8
	        int i = K;
	        int temp = 0;
	      
	        while (i > 0){
	        	temp = A[A.length -1];
	            for (int j = A.length -1 ; j>0 ;j--){            
	                A[j] = A[j-1];	                
	            }
	            A[0] = temp; 
	            i--;
	        }
	        return A;
	    }
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		solution(a, 4);
		for (int i = 0; i< a.length ; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
