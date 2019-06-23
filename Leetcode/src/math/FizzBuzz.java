package math;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i<=n; i++){
            String num; 
            if (i%3 == 0 && i%5 !=0){
               num = "Fizz";
            }else if(i%5==0 && i%3 !=0 ){
               num = "Buzz";
            }else if (i%15 ==0 ){
                num ="FizzBuzz";
            }else{
                num = Integer.toString(i); 
            }
            
            list.add(num);
        }
        return list; 
    }

}
