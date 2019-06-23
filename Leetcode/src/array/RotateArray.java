package array;

import java.util.Arrays;

public class RotateArray {
	 /*
    public void rotate(int[] nums, int k) {
        Deque<Integer> dq = Arrays.stream(nums).boxed().collect(Collectors.toCollection(LinkedList::new));
        while(k>0){
            dq.addFirst(dq.removeLast());
            k--;
        }
        int i = 0;
        for(int a: dq){
            nums[i] = a;
            i++;
        }
    }
    */
     public void rotate(int[] nums, int k) {           
       while (k > nums.length){
           k = k-nums.length; 
       }
       int[] b = new int[k];
       b = Arrays.copyOfRange(nums, nums.length-k, nums.length);
          
       int i = nums.length-1-k;
       while(i>=0){
           nums[i+k] = nums[i]; 
           i--;           
       }  
       for (int j=0; j<b.length;j++){
           nums[j] = b[j];
       }
       
    }
}
