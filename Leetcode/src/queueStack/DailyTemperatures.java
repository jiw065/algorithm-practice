package queueStack;

import java.util.Stack;

//[73, 74, 75, 71, 69, 72, 76, 73]
public class DailyTemperatures {
	 // brute force
    public int[] dailyTemperatures1(int[] T) {
        int[] days = new int[T.length];
        if(T.length ==1 ){
            days[0] = 0;
            return days; 
        } 
        int j = 1; 
        for (int i= 0; i<T.length;i++){
             while(j<T.length-1 && T[i]>=T[j]){               
                    j++;
             }             
             if(T[i]<T[j]){
                 days[i] = j-i;
             }else{
                 days[i] = 0;
             }
            j = i+1; 
        }
                  
        return days;
    }
    // stack
    public int[] dailyTemperatures(int[] T) {
        int[] days = new int[T.length];
        if(T.length ==1 ){
            days[0] = 0;
            return days; 
        } 
        Stack<Integer> temp = new Stack<>();
        // store the index into the stack
        for (int i= 0; i<T.length;i++){     
        	// if the temp is higher keep pop the elements
            while(!temp.isEmpty() && T[i] > T[temp.peek()]){
                int index = temp.pop();
                days[index] = i-index;
            }
            if(temp.isEmpty()){
                days[i] =0;
            }
            temp.push(i);
        
        }
        return days; 
    }

}
