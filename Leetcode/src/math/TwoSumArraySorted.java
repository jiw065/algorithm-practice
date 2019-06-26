package math;

public class TwoSumArraySorted {
	public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i=0; i<nums.length;i++){
            int key = target - nums[i];
            int index = Arrays.binarySearch(nums, key);
            if(index >= 0 && index!=i){
                ans[0] = Math.min(i,index)+1; // this used to handle the dup case 
                ans[1] = Math.max(i,index)+1;
                break;
            }
            
        }
        
        return ans; 
    }
}
