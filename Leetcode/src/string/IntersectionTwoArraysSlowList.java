package string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionTwoArraysSlowList {
	 public int[] intersect(int[] nums1, int[] nums2) {
	        List<Integer> l1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
	        List<Integer> l2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
	         List<Integer> l3 = new ArrayList<Integer>();
	        
	        if (l1.size() <= l2.size()){
	            for (Integer i : l1){
	                if(l2.contains(i)){
	                    l2.remove(i);
	                    l3.add(i);
	                }
	            }
	        }else{
	             for (Integer i : l2){
	                if(l1.contains(i)){
	                    l1.remove(i);
	                    l3.add(i);
	                }
	            }
	        }
	        
	    return l3.stream().mapToInt(i->i).toArray();    
	        
	        
	    }
}
