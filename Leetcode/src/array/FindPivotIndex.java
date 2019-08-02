class Solution {
   
   /*
   sum-nums[i]-leftsum = rightsum
   Once rightSum = leftSum
   It will be sum - nums[i] - leftSum = leftSum
   */

    
     public int pivotIndex(int[] nums) {
       int sum = 0, leftSum = 0;
         // get the total sum
       for(int x : nums ) sum += x;
         //S - nums[i] - leftsum == leftSum (right sum) 
       for(int i = 0; i<nums.length;i++){
           if(leftSum == sum-leftSum-nums[i]){
               return i;
           }
           // like right sum
           leftSum += nums[i]; 
       }   
        
         return -1;
     }
    
    
     // failed try [-1,-1,-1,-1,0,1]
    /*
    public int pivotIndex1(int[] nums) {
        if (nums.length ==0) return -1;
        int left = 0;
        int right = nums.length-1;
        int rnum = nums[right];
        int lnum = nums[left];
        while(left<=nums.length-1 && right>=0){ 
            if(Math.abs(lnum) > Math.abs(rnum)){
                right--;
                if(right>=0)rnum +=nums[right];
            }else if(Math.abs(lnum) < Math.abs(rnum)){
                left++;
                if(left<=nums.length-1)lnum += nums[left];
            }else{
                if(left+1 == right-1){
                    return left+1;
                }else{
                    right--;
                    if(right>=0)rnum +=nums[right];
                    left++;
                    if(left<=nums.length-1)lnum += nums[left];
                }
            }
        }
        
        return -1;
    }
    */
    
}
