package array;

public class FindAllDuplicatesinanArray {
	/*  
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            if(!hs.add(nums[i])){
                ans.add(nums[i]);
            }
        }
        
        return ans; 
    }
   */ 
    
    /*
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i =0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]){
                ans.add(nums[i]);
            }
        }
        
        return ans; 
    }
    */

  // when find a number i, flip the number at position i-1 to negative. 
    // if the number at position i-1 is already negative, i is the number that occurs twice.
    
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1; 
            
           if(nums[index] >0){ 
                nums[index] = - nums[index];
            }else{
               // If it is not greater than 0 (i.e) negative then the number is a duplicate
                res.add(Math.abs(nums[i])); 
            }
        }
             
        return res;
    }
        
    
}
