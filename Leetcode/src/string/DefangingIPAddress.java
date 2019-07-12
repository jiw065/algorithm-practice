package string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DefangingIPAddress {
	public String defangIPaddr(String address) {
        List<Character> l = new ArrayList<>();
        for(int i=0;i<address.length();i++){
           if(address.charAt(i) == '.'){
               l.add('[');
               l.add('.');
               l.add(']');
           }else{
               l.add(address.charAt(i));
           } 
            
        }
       String result = l.stream().map(String::valueOf).collect(Collectors.joining());
        return result; 
    }
}
