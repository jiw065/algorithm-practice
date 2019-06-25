package array;

public class ShortestUnsortedContinuousSubarray {
	public int findUnsortedSubarray(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);

        int count =0;
        int i =0, j=nums.length-1;
        int left = i-1;
        int right = j+1;
        while(j>=i && copy[i]==nums[i]){
            left = Math.max(i,left);
            i++;
        }
        while(j>=i && copy[j]==nums[j] ){
            right = Math.min(j,right);
            j--;
        }
        return right-left-1; 
    }
}
