import java.util.LinkedList;
import java.util.stream.Collectors;

public class PlusOne66 {
	 public int[] plusOne(int[] digits) {
	       LinkedList<Integer> num = Arrays.stream(digits).boxed().collect(Collectors.toCollection(LinkedList::new));
	     //   for (int i =0 ; i< digits.length;i++){
	     //       num.add(i,digits[i]);
	      //  }
	        int head = digits[0];
	        for(int i=digits.length-1 ;i>=0; i--){
	           
	            if(digits[i] != 9){
	              num.set(i,digits[i]+1); 
	                break;
	            }else{
	              num.set(i,0); 
	            }
	            
	            if(num.get(0) == 0 && head != 0){
	                num.addFirst(1);
	            }
	        }
	        return num.stream().mapToInt(i->i).toArray();
	    }
}
