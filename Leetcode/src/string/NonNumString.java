package string;


public class NonNumString {

	public static int Solution(String A) {
		if(A.length() == 0) return -1; 
		int count =0;
		int max = Integer.MIN_VALUE;
		for (int i=0; i<A.length();i++) {
			char c = A.charAt(i);
			if (('a'<= c && 'z'>=c)|| ('A'<= c && 'A'>=c) ) {
				count++;
			}else {
				count = 0; 
			}
			max = Math.max(max, count);
 		}
		if(max == 0) {
			return -1;
		}else {
			return max;
		}
		
	}
	public static void main(String[] args) {
		String a = "";
		System.out.println(Solution(a));

	}

}
