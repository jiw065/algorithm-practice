package list;

import java.util.Stack;

class MinStack {

    /** initialize your data structure here. */
    int min;
    Stack<Integer> st; 
    
    public MinStack() {
        min = Integer.MAX_VALUE;
        st = new Stack<>();
    }
    
    public void push(int x) {
        if (min >= x ){
            st.push(min); //add the old min value before adding new element 
            min = x;
            
        }
        
        st.push(x);
    }
    
    public void pop() {
        if(st.pop() == min){ // removed min value
            min = st.pop(); // pop(remove) the second min value
        }
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
         return min; 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */