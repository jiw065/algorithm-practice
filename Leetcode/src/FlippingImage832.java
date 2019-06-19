
public class FlippingImage832 {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] B = new int[A.length][];
        for (int i=0; i<A.length;i++){
            B[i] = new int[A[i].length];
            int len = 0;
            for (int j =A[i].length-1; j>=0;j--){
                B[i][len] =  A[i][j]==1 ? 0:1;
                len++;
            }
        }
        
        return B; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
