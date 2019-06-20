
public class MoveZeroes {
	 public void moveZeroes(int[] nums) {
	        int index =0;
	        //move non-zero values forward
	        for (int i =0;i<nums.length;i++){
	            if (nums[i] != 0){
	                nums[index] = nums[i];
	                index++;
	            }
	        }
	        // append 0 to the rest
	        for(int i = index; i<nums.length;i++){
	            nums[i] = 0;
	        }
	        
	     
	    }
}
