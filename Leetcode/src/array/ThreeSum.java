package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
	 // brute force
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
       
        Arrays.sort(nums);

        for (int i=0; i<nums.length-2;i++){        
            int target = -nums[i];            
            int left = i+1;            
            int right = nums.length-1;
           // System.out.println(target+" "+left+" "+right);
            while(left<right){     
               int sum =  nums[left]+nums[right];
                if(sum == target){     
                    List<Integer> sub = new ArrayList<>();
                    sub.add(nums[i]);
                    sub.add(nums[left]);
                    sub.add(nums[right]);
                    Collections.sort(sub);
                    if(!ans.contains(sub)){
                        ans.add(sub); 
                    }                                  

                    right--;
                    left++;
                }else if(sum>target){
                    right--;
                }else{
                    left++;
                }                
            }                       
        }
        
        return ans;
    }
}
