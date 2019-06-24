package math;
import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        for(int i =0 ;i<nums.length;i++){
           hm.put(nums[i],i);
        }
        System.out.println(hm.size());
        for(int i =0 ;i<nums.length;i++){
            int s = target - nums[i];
           
            if (hm.containsKey(s) && i!= hm.get(s)){
               
                result[0] = i;
                result[1] = hm.get(s);
                return result; 
            }
        }
        
        return result; 
    }
	
	// find the number but not the index
    public int[] twoSum2(int[] nums, int target) {
       int[] result = new int[2]; 
       int left = 0;
       int right = nums.length-1;
       Arrays.sort(nums);
       while(left < right){
           if(nums[left]+nums[right]==target){
               result[0] = nums[left];
               result[1] = nums[right]; 
               break;
           }
           if (nums[left]+nums[right]<target){
               left++;
           }else{
               right--; 
           }
           
       } 
        return result; 
   }
}
