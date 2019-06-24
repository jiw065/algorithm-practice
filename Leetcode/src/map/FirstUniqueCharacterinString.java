package map;

public class FirstUniqueCharacterinString {
	 public int firstUniqChar(String s) {
	        char[] cl = s.toCharArray();
	        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
	        for (int i = 0; i<cl.length;i++){
	            count.put(cl[i], count.getOrDefault(cl[i], 0) + 1);
	        }
	       // find the index
	        for (int i = 0; i < cl.length; i++) {
	            if (count.get(cl[i]) == 1){
	                return i;
	            } 
	                
	        }
	        return -1;
	    }
}
