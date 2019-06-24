package array;

public class FindAllNumbersDisappearedArray {
	  public List<Integer> findDisappearedNumbers(int[] nums) {
	         List<Integer> list = new ArrayList<>();
	        for (int i=0 ;i<nums.length;i++){
	            int index = Math.abs(nums[i])-1;
	            if(nums[index] > 0){
	                nums[index] = -nums[index];
	            }
	        }
	        
	        for (int i=0 ;i<nums.length;i++){
	            if(nums[i]>0){
	                list.add(i+1);
	            }
	        }
	        
	        return list; 
	    }
	    
	    
	  /*  
	   public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length;i++){
            hs.add(nums[i]);
        }
       
        for (int index : hs){
            nums[index-1] = -nums[index-1]; 
        }
        
        
         for (int i=0 ;i<nums.length;i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
         
         return list; 
    }
	    */
}
