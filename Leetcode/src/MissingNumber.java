import java.util.Arrays;

public class MissingNumber {
	 public int missingNumber(int[] nums) {
	        
	        Arrays.sort(nums);
	        
	        int num;
	        for(int i =0;i<nums.length-1;i++){
	            if(nums[i]+1 != nums[i+1]){
	                return nums[i]+1;
	            }
	        }
	        if (nums[0] != 0){
	            return 0;
	        }else{
	            return nums.length; 
	        }
	    }
}
