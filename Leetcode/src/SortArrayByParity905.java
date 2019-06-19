
public class SortArrayByParity905 {
	public int[] sortArrayByParity(int[] A) {
	    int sub;

	      int[] E = new int[A.length];
	      int[] O = new int[A.length];
	      int even = 0;
	      int odd = 0;   
	      for(int i =0;i<A.length;i++){
	          if(A[i]%2 == 0){
	              E[even] = A[i];
	              even++;
	          }else{
	              O[odd] = A[i];
	              odd++;
	          }
	      }  
	       for (int i = 0; i<even;i++){
	               A[i] = E[i];
	       }
	      
	     for (int i = 0; i<odd;i++){
	               A[even+i] = O[i];
	       }   
	        
	       return A;  
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
