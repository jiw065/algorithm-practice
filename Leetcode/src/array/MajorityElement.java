package array;
import java.util.Arrays;

public class MajorityElement {
	 public int majorityElement(int[] nums) {
	        Arrays.sort(nums);
	        int count = 1;
	        int maxCount = Integer.MIN_VALUE;
	        int num = -1;
	        if (nums.length == 1){
	            return nums[0];
	        }

	        
	        for (int i=0; i<nums.length-1;i++){
	            if (nums[i] == nums[i+1]){
	                count++;
	            }else{
	                count = 1; 
	            }
	            if(maxCount < count){
	              
	                maxCount = count;
	                if (maxCount >= Math.round((double)nums.length/2)){
	                    num = nums[i]; 
	                }
	                
	                
	            }
	        }
	        return num; 
	    }
}
