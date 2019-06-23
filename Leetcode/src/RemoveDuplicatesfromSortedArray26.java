
public class RemoveDuplicatesfromSortedArray26 {
	public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0; 
        int n = nums.length-1;
        int temp = nums[0];
        int len = 1; 
        for (int i =1 ;i<=n;i++){
            if (temp != nums[i] ){
                temp = nums[i];
                nums[len] = nums[i];
                len++;
            }
            
        }
        
        return len; 
    }
}
