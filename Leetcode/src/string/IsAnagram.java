package string;
import java.util.Arrays;

public class IsAnagram {
	  public boolean isAnagram(String s, String t) {

	        char[] sc = s.toCharArray();
	        char[] tc = t.toCharArray();
	        if (s.length() != t.length()){
	            return false; 
	        }
	        Arrays.sort(sc);
	        Arrays.sort(tc);
	        
	        for (int i =0; i<sc.length;i++){
	            if (sc[i] != tc[i]){
	                return false;
	            }
	        }
	        return true;
	    }
}
