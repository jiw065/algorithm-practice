package string;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        int begin = 0;
        int end = s.length()-1;

        
        String us = s.toUpperCase();
        while(begin<end){
            while(begin<=s.length()-1 && !Character.isLetterOrDigit(us.charAt(begin))){
                begin++;
            }
            
            while(end>=0 && !Character.isLetterOrDigit(us.charAt(end))){
                end--;
            }
            
            if(begin > s.length()-1&& end <0){
                return true; 
            }
            
            if(us.charAt(begin)!=us.charAt(end)){
                return false;                 
            }
            
            begin++;
            end--;
            
        }
        
        return true; 
    }
}
