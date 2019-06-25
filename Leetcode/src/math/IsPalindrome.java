package math;

public class IsPalindrome {
	public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int rev = 0;
        int num = x;
        // reverse the num
        while(x>=1){
            rev = rev*10 + x%10;
            x/=10;
        }
         
        return rev == num; 
        
    }
    //https://leetcode.com/problems/reverse-integer/
}
