package hashset;
import java.util.HashSet;
import java.util.Iterator;

class SingleNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i=0; i< nums.length; i++){
            if(!hs.add(nums[i])){
               hs.remove(nums[i]);
            }
            
        }
        Iterator<Integer> it = hs.iterator();
    //    int num = 0; 
    //    while (it.hasNext()){
    //        num = it.next();
    //    }
        return it.hasNext()?it.next():0; 
    }
}