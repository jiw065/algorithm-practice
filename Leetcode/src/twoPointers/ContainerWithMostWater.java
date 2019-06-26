package twoPointers;
//11
public class ContainerWithMostWater {
	 public int maxArea(int[] height) {
	        if(height.length <= 1) return 0; 
	        int maxArea = Integer.MIN_VALUE;
	        int left = 0;
	        int right = height.length-1; 
	        while(left<right){
	            int w = right-left;
	            int h = Math.min(height[left],height[right]);
	            int area = w*h;
	            maxArea = Math.max(maxArea, area); 
	            //move the shorter height forward to see if the height can be increased 
	            if(height[left]>height[right]){
	                right--;
	            }else{
	                left++;
	            }
	        }
	        
	        return maxArea; 
	        
	    }
}
