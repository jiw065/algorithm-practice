package algorithemMethod.slidingwindow;

public class FindAllAnagramsinaString {
	public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<Integer>();
        if(p.length()> s.length()) return ans;
        Map<Character,Integer> pm = new HashMap<>();
        for(int i=0; i<p.length();i++){
            pm.put(p.charAt(i),pm.getOrDefault(p.charAt(i), 0) + 1);
        }
        int j =0, i=0;
        int counter = pm.size(); //count the number of each character apprence
       // int index = Integer.MAX_VALUE;
       while(i < s.length()){
            char c = s.charAt(i);
           //System.out.println("c "+c); 
            // handle match case
            if(pm.containsKey(c)){
            //  index = Math.min(i,index);  
              pm.put(c,pm.get(c)-1);
              if(pm.get(c)==0){
                  counter--;  // when the character(include dup) matched the pattern ,counter -1  
              }             
            //                
            } 
           
           i++;
            //reset the pm
            while(counter == 0){
                char tc = s.charAt(j);
               // System.out.println("tc "+tc); 
                if(pm.containsKey(tc)){
                    pm.put(tc,pm.get(tc)+1); 
                    if(pm.get(tc) > 0)counter++; // ???? what happends for dup char                 
                }
                
               //ans.add(index); // add the inital index ??? how about the first char does not match ???
               if(i-j == p.length()){
                   ans.add(j);
               }
               j++;                 
            }               
        }
         return ans; 
    }

}
