package map;

import java.util.HashMap;

public class Dominator {
	public int solution(int[] A) {
        // write your code in Java SE 8
       int halfLen = A.length/2; 
       HashMap<Integer,Integer> hm = new HashMap<>();
       for(int i =0; i< A.length;i++){
           hm.put(A[i],hm.getOrDefault(A[i],0)+1);
       }
       
       int max = Integer.MIN_VALUE;
       for(int c : hm.keySet()){
           if(halfLen < hm.get(c)){
               int i = 0;
               while(A[i] != c ){
                   i++;
               }
               return i; 
           }
       }
       
      
        return -1; 
       
       
    }
}
