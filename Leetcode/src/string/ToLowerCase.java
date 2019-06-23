package string;

public class ToLowerCase {

	  public String toLowerCase(String str) {
	        final int UPPER_A = 'A';
	        final int GAP = 'a'-'A';
	        final int UPPER_Z = 'A'+25;
	        char[] ca = str.toCharArray();
	      
	        for(int i = 0; i<ca.length;i++){
	            int c = ca[i];
	            if (c >= UPPER_A && c <= UPPER_Z ){
	                ca[i] = (char)(c + GAP);
	            }
	        }
	        String a = String.valueOf(ca);
	        return a; 
	    }
	public static void main(String[] args) {
		int a = 'a'+25;
		int A = (char)'A'+25;
		char c = (char) (A+32); 
		System.out.println(a +" "+A+" "+(a-A)+" "+c);
		String s ="Hello";
		
	}

}
