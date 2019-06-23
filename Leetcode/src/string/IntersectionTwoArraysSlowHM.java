package string;

public class IntersectionTwoArraysSlowHM {
	 public int[] intersect(int[] nums1, int[] nums2) {

	        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
	        HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>();
	        List<Integer> l = new ArrayList<Integer>();
	        for(int i=0; i<nums1.length; i++){
	                map1.put(nums1[i],map1.getOrDefault(nums1[i], 0)+1);
	        }
	        
	        for(int i=0; i<nums2.length; i++){
	                map2.put(nums2[i],map2.getOrDefault(nums2[i], 0)+1);
	        }
	        
	        for (Integer k : map1.keySet()){
	            if (map2.get(k) != null){
	                int max = Math.min(map1.get(k),map2.get(k));
	                while(max > 0 ){
	                    l.add(k);
	                    max--;
	                }
	            }
	        } 
	       
	        return l.stream().mapToInt(i->i).toArray();  
	    }
}
