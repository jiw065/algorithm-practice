class Solution {
    public int dominantIndex1(int[] nums) {
    //brute force
        int maxNum = Integer.MIN_VALUE;
        int index = -1;
        // find the max num 
        for(int i=0;i<nums.length;i++){
            if(maxNum <= nums[i]){
                maxNum = nums[i];
                index = i;
            }
        }
        // validation
        for(int j =0; j<nums.length;j++ ){
            if(maxNum < 2*nums[j] && j!= index ){
                return -1;
            }
        }
       // System.out.println(maxNum);
        
        return index; 
        
    }
    
    // try to use one loop to record max and sec max value
    public int dominantIndex(int[] nums) {
        int max = -1, index = -1, second = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                second = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > second)
                second = nums[i];
        }
        return second * 2 <= max ? index : -1;
    }
    
}
