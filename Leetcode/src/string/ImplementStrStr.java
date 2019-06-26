package string;

public class ImplementStrStr {
	 // brute-force search
    public int strStr(String haystack, String needle) {
        if(haystack.length() <needle.length()) return -1;
        if (needle.equals("")) return 0; 
        
        int h =0;
        int n =0;
        for (int i=0; i<haystack.length();i++){
            if(i+needle.length()>haystack.length())break; // if exceed the max length get out of the loop 
            n = 0;
            h= i; 
            while(h<haystack.length()&& n<needle.length() &&haystack.charAt(h) == needle.charAt(n)){
                n++;
                h++;
                if(n == needle.length()){
                    return i; 
                }
            }      
        }
        
        return -1; 
    }
    
   //brute force 
   public int strStr2(String haystack, String needle) {
    for (int i = 0; ; i++) {
    for (int j = 0; ; j++) {
      if (j == needle.length()) return i;
      if (i + j == haystack.length()) return -1;
      if (needle.charAt(j) != haystack.charAt(i + j)) break;
    }
  }
}
    
   // this problem can be resolved with KMP 
}
