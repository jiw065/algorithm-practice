import java.util.Stack;

public class Brackets {

    public int solution(String S) {
        // write your code in Java SE 8
        
        if (S.length()%2 == 1 ){
            return 0;
        }
        if (S.length() == 0){
            return 1; 
        }
        
        Stack<Character> st = new  Stack<Character>();
        for (int i =0; i<S.length();i++ ){
           // System.out.println("this is a debug message "+S.charAt(i));
            if(S.charAt(i) =='('||S.charAt(i) =='['||S.charAt(i) =='{'){
                st.push(S.charAt(i));
                
            }else if(st.isEmpty() || (S.charAt(i) == ')' && st.pop() != '(') ||
                     (S.charAt(i) == ']' && st.pop() != '[') ||
                     (S.charAt(i) == '}' && st.pop() != '{') ){
                         
                 return 0;
                 
            }
        }
        
        return st.isEmpty()?1:0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
