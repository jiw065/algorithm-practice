package list;
import java.util.Stack;

public class ValidParentheses20 {
	public boolean isValid(String s) {
        if (s.length() == 1) return false; 
        Stack<Character> st = new Stack<>();
        int len = s.length();
        for (int i=0; i<len; i++){
            char c = s.charAt(i);
            char p ; 
            if (c == '('||c=='{'||c=='['){
                st.push(c);
            }else{
                if(st.size() ==0){
                    return false; 
                } 
                    p = st.pop();
                if (!(c == ')' && p=='(')&&!(c == '}' && p=='{')&&!(c == ']' && p=='[') ){
                    return false; 
                }
            }
                
        
            
        }
        
        return st.size() ==0 ? true:false; 
    } 
}
