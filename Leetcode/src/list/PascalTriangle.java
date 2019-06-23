package list;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	 public List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> l = new ArrayList<List<Integer>>();      
	                     
	        for (int i=0; i< numRows; i++){
	            List<Integer> ll = new ArrayList<Integer>();
	            if (i == 0 ){
	                ll.add(1);
	            }else{
	                List<Integer> prior = l.get(i-1);
	                for (int j=0; j<=i;j++){
	                    int num =0; 
	                    if(j==0 || j==i){
	                        num = 1; 
	                    }else{
	                        num = prior.get(j-1)+prior.get(j); 
	                    }
	                    ll.add(j,num);
	                }
	            }
	           
	            l.add(ll);
	            
	        }
	        
	        
	        return l;
	    }
}
